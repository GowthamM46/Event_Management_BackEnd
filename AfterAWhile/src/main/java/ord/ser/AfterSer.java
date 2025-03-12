package ord.ser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesb.AterModel;

import ors.we.AfterDAO;

@Service
public class AfterSer {
	
	@Autowired 
	private AfterDAO aft;
	
	private List<AterModel> aftGet() {
		return aft.aftGet();
		

	}
	

}
