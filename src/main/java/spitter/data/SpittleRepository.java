package spitter.data;

import java.util.List;

import spitter.model.Spittle;

public interface SpittleRepository {

	List<Spittle> findSpittles(long max, int count);

}
