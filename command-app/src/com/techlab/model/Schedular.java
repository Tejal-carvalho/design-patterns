package com.techlab.model;

import java.util.ArrayList;

public class Schedular {
	ArrayList<ICommand> cmds;

	public Schedular() {
		cmds = new ArrayList<ICommand>();
	}

	public void executeAll() {
		for (int i = 0; i < cmds.size(); i++) {
			cmds.get(i).execute();

		}

	}

	public void undoAll() {
		for (int i = cmds.size()-1; i >= 0; i--) {
			cmds.get(i).undo();

		}
	}

	public void addCommand(ICommand cmd) {
		cmds.add(cmd);
	}

}
