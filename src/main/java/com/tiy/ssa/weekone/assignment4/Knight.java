package com.tiy.ssa.weekone.assignment4;

public class Knight {

    private int x ;
    private int y ;
    final int xHome;
    final int yHome;

    public Knight(int x, int y) {

	this.xHome = x;
	this.yHome = y;

    }

    public int xHome(int xHome)

    {

	return xHome;

    }

    public int yHome(int yHome) {

	return yHome;

    }

    public boolean isHome(int x, int y)

    {
	this.x = x;
	this.y = y;

	if ((this.x == xHome) && (this.y == yHome))

	    return true;

	return false;
    }

    public boolean isFirstMoveFromHomeLegal(int x, int y)

    {

	this.x = x;
	this.y = y;

	if ((this.x == xHome + 1) && (this.y == yHome + 2))
	    return true;

	if ((this.x == xHome - 1) && (this.y == yHome + 2))
	    return true;

	if ((this.x == xHome + 1) && (this.y == yHome - 2))
	    return true;

	if ((this.x == xHome - 1) && (this.y == yHome - 2))
	    return true;

	if ((this.x == xHome + 2) && (this.y == yHome + 1))
	    return true;

	if ((this.x == xHome - 2) && (this.y == yHome + 1))
	    return true;

	if ((this.x == xHome + 2) && (this.y == yHome - 1))
	    return true;

	if ((this.x == xHome - 2) && (this.y == yHome - 1))
	    return true;

	return false;

    }

    public boolean move(int x, int y) {
	this.x = x;
	this.y = y;

	if (isFirstMoveFromHomeLegal(this.x, this.y) == true) {

	    System.out.printf("Knight Home coordinates: (%d,%d)", xHome, yHome);
	    System.out.println("");
	    System.out.printf("Knight moved to: (%d,%d) ", this.x, this.y);

	    System.out.println("   \n   returning home .....\n");

	    // offset (x+1, y+2)

	    System.out.printf("Knight return path first coordinate: (%d,%d)", xHome + 3, yHome + 1);
	    System.out.println("");

	    System.out.printf("Knight return path second coordinate: (%d,%d)", xHome + 2, yHome - 1);
	    System.out.println("");
	    System.out.printf("Knight home again: (%d,%d)", xHome, yHome);

	    return true;

	}

	else

	    System.out.println("Move not legal");

	return false;

    }
}
