package java0311;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Mp3Main {

	public static void main(String[] args) {
		try{
			Player p = new Player(new FileInputStream("C:\\Users\\503_08\\Documents\\카카오톡 받은 파일\\방가방가 햄토리 오프닝_엔딩 - SBS 더빙판.mp3"));
			p.play();
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
