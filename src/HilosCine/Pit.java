package HilosCine;

public class Pit {
	
	SeatGenerator seatGenerator;
	
	public Pit() {
		super();
		seatGenerator = new SeatGenerator();
	}

	public Seat getSeat(Coordenada coordenada) {
		return seatGenerator.getSeat(coordenada);
	}
	
}
