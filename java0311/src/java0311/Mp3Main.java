package java0311;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Mp3Main {

	public static void main(String[] args) {
		try{
			Player p = new Player(new FileInputStream("C:\\Users\\503_08\\Documents\\īī���� ���� ����\\�氡�氡 ���丮 ������_���� - SBS ������.mp3"));
			p.play();
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
