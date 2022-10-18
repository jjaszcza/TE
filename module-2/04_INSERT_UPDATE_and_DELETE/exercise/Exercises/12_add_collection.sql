-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)

INSERT INTO collection (collection_name)
	VALUES ('Bill Murray Collection');
	
--SELECT collection_id
--FROM collection
--WHERE collection_name = 'Bill Murray Collection'

--SELECT m.movie_id
--	FROM movie AS m
	--	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	--	JOIN person AS p ON ma.actor_id = p.person_id
--	WHERE person_name = 'Bill Murray'

UPDATE movie
	SET collection_id = (SELECT collection_id FROM collection WHERE collection_name = 'Bill Murray Collection')
WHERE movie_id IN (
			SELECT m.movie_id
			FROM movie AS m
				JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
				JOIN person AS p ON ma.actor_id = p.person_id
			WHERE person_name = 'Bill Murray')