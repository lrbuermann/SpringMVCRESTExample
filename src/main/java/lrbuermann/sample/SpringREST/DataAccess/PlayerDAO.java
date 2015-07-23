package lrbuermann.sample.SpringREST.DataAccess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.*;
import lrbuermann.sample.SpringREST.beans.Player;

public class PlayerDAO {
	public static List<Player> getAllPlayers() {
		Reader in;
		List<Player> players = new ArrayList<Player>();
		try {
			in = new FileReader("C://players.csv");
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
			for (CSVRecord record : records) {
				String lastName = record.get(0);
				String firstName = record.get(1);
				String team = record.get(2);
				String position = record.get(3);
				Player p = new Player(firstName,lastName,team,position);
				players.add(p);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return players;
	}
}
