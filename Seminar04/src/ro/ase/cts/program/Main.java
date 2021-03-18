package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
		BrokerTranzactie broker2 = BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		broker1.setName("gabita");
		broker2.setName("gabitelul");
		
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		BrokerTranzactieLazy brokerLazy1 = BrokerTranzactieLazy.getInstance("giovanni", 2, 30);
		BrokerTranzactieLazy brokerLazy2 = BrokerTranzactieLazy.getInstance("petrescu", 40, 550);
	
		System.out.println(brokerLazy1);
		System.out.println(brokerLazy2);
	}

}
