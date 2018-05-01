package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GamePlayBlackJackTest {

	@Test
	public void GamePlayBlackJackTest1() {
		Table t = new Table();
		assertNotNull(t);
		
		Player p1 = new Player("Joe",1);
		Player p2 = new Player("Bert",2);
		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		
		GamePlayBlackJack gpbj = new GamePlayBlackJack(t);
		ArrayList<Player> lstPlayer = t.GetTablePlayers();
		gpbj.AddPlayersToGame(lstPlayer);//changed from GetTable
		assertEquals(2, gpbj.GetPlayersInGame().size());
		
		Player pGet = gpbj.GetPlayerInGame(p1);
		
		assertNotNull(pGet);
		assertEquals(p1,pGet);
		
		t.ClearTable();
		assertEquals(0,gpbj.GetPlayersInGame().size());
		

	}

}
