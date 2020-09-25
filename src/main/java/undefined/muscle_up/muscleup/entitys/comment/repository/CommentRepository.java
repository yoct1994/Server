package undefined.muscle_up.muscleup.entitys.comment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import undefined.muscle_up.muscleup.entitys.comment.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
