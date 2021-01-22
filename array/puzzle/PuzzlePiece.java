
public class PuzzlePiece {
	private int face_value; // the value written on the piece's face
	// Constructor PuzzlePiece creates a piece
	// 
	public PuzzlePiece(int value) {
		face_value = value;
	}
	
	// valueOf returns the face value of the piece
	public int valueOf() {
		return face_value;
	}
}
