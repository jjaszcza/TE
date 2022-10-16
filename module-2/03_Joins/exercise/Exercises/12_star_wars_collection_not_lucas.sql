-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)

SELECT title
FROM movie AS m
	JOIN collection AS c ON c.collection_id = m.collection_id
	JOIN person AS p ON p.person_id = m.director_id
WHERE collection_name LIKE 'Star Wars Collection' AND person_name != 'George Lucas'
ORDER BY title