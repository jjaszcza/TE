-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later, sorted alphabetically.
-- (6 rows)

SELECT DISTINCT genre_name
FROM genre AS g
	JOIN movie_genre AS mg ON g.genre_id = mg.genre_id
	JOIN movie AS m ON m.movie_id = mg.movie_id
	JOIN movie_actor AS ma ON ma.movie_id = m.movie_id
	JOIN person AS p ON p.person_id = ma.actor_id
WHERE person_name = 'Robert De Niro' AND release_date > '20100101'
ORDER BY genre_name



