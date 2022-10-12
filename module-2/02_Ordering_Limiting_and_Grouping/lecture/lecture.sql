-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT state_name, population
FROM state
ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.

SELECT state_name, census_region
FROM state
WHERE census_region IS NOT NULL
ORDER BY census_region DESC, state_name ;
-- The biggest park by area

SELECT park_name, area
FROM park
ORDER BY area DESC;

-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name, population
FROM city
ORDER BY population DESC 
LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.

SELECT park_name, date_established, CURRENT_DATE-date_established AS age
FROM park
--WHERE (CURRENT_DATE-date_established) > 55000
ORDER BY date_established
LIMIT 20;

SELECT CURRENT_DATE


-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT city_name || ' (' || state_abbreviation || ')'
from city
ORDER BY city_name;

-- The all parks by name and date established.

SELECT 'Park Name: ' || park_name || 'date est. ' || date_established
FROM park
-- The census region and state name of all states in the West & Midwest sorted in ascending order.

SELECT census_region || ', ' || state_name
FROM state
WHERE census_region IN ('West', 'Midwest')
ORDER BY census_region, state_name;
-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.

SELECT AVG(population) AS avg_pop
FROM state

-- Total population in the West and South census regions
SELECT SUM (population) AS total_pop
FROM state
WHERE census_region IN ('West', 'South');

-- The number of cities with populations greater than 1 million
SELECT COUNT(population) AS pop_count
FROM city
WHERE population > 1000000;
-- The number of state nicknames.
SELECT COUNT(state_nickname) AS nick_name_count
FROM state


-- The area of the smallest and largest parks.
SELECT MIN(area) AS smallest_area, MAX(area) AS largest_area 
FROM park


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT COUNT (city_name) AS city_count, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY city_count DESC;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT AVG(area) AS avg_area, has_camping
FROM park
GROUP BY has_camping

-- Sum of the population of cities in each state ordered by state abbreviation.

SELECT SUM(population) AS total_pop, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;
-- The smallest city population in each state ordered by city population.
SELECT MIN (population) AS total_pop, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY total_pop DESC;


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
SELECT * FROM city


-- SUBQUERIES (optional)
SELECT (SELECT MAX (area) FROM state) * 2 AS double_max_area;

SELECT * FROM state;

SELECT *
FROM city
WHERE city_id IN (SELECT capital FROM state);

--correlated subquery here: 
SELECT state_name,
	(SELECT city_name FROM city WHERE city_id = state.capital) AS capital_name 
FROM state
ORDER BY state_name


-- Include state name rather than the state abbreviation while counting the number of cities in each state,


-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.

