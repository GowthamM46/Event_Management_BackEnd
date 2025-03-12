package ors.we;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wesb.AterModel;
@Repository
public class AfterDAO implements AfterDAOInter {

	public List<AterModel> aftGet() {
		List<AterModel> b=new LinkedList<>();
		
		static {
			b.add(new AterModel(1,"Gow",1));
			b.add(new AterModel(1,"Gow",1));
		}
		
		List<AterModel> aftGet(){
			return b;
		}
	}

}
