package net.neferett.linaris;

import net.neferett.linaris.api.API;

public class Main extends API {

	public Main() {
		super("Game Name", "Game Map Name", PLAYERS NUMBERS);
	}

	@Override
	public void addRanks() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClose() {
		this.closeServer();
	}

	@Override
	public void onLoading() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onOpen() {
		this.openServer();
	}

	@Override
	public void RegisterCommands() {
		// TODO Auto-generated method stub

	}

}
