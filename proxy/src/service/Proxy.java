package service;

public class Proxy implements Sujet {
	CSujet cs;

	public Proxy() {
		cs = new CSujet();
	}

	@Override
	public void TransfertMessage(String message) {
		System.out.println("Proxy : contr�le de Message");
		System.out.println("*******************************");
		if (message.equals("Bonjour")) {
			System.out.println("Proxy : Message " + message + " Transf�r� ");
			cs.TransfertMessage(message);
		} else
			System.out.println("Proxy : Message " + message + " bloqu� !!!!! \n\n");
	}
}
