-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection", sorted alphabetically.
-- (28 rows)

SELECT DISTINCT person_name
FROM person AS p
	JOIN movie_actor AS ma ON person_id = actor_id
	JOIN movie AS m ON m.movie_id = ma.movie_id
	JOIN collection AS c ON c.collection_id = m.collection_id
WHERE title LIKE '%Back to the Future%'
ORDER BY person_name