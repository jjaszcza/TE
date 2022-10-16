-- 7. The genres of movies that Christopher Lloyd has appeared in, sorted alphabetically.
-- (8 rows) Hint: DISTINCT will prevent duplicate values in your query results.

SELECT DISTINCT genre_name
FROM genre AS g
	JOIN movie_genre AS mg ON g.genre_id = mg.genre_id
	JOIN movie AS m ON m.movie_id = mg.movie_id
	JOIN movie_actor AS ma ON ma.movie_id = m.movie_id
	JOIN person AS p ON p.person_id = ma.actor_id
WHERE person_name = 'Christopher Lloyd'
ORDER BY genre_name


	
