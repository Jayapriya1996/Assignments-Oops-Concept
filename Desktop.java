package org.college;

class Desktop extends Computer {
	public void desktopsize()
	{
		String size="1366*768";
		System.out.println("Size - "+size);
	}

	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopsize();

	}

}
