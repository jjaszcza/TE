-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent first. 
-- (9 rows)
SELECT title
FROM movie AS m
	JOIN collection AS c ON m.collection_id = c.collection_id
WHERE collection_name LIKE 'Star Wars Collection'
ORDER BY release_date DESC

