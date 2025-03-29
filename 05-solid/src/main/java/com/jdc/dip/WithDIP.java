package com.jdc.dip;

public class WithDIP {
	public static void main(String[] args) {
		InputDevice keyboard = new Keyboard1();
		Computer1 c1 = new Computer1(keyboard);
		c1.start();
		
		InputDevice mouse = new Mouse();
		Computer1 c2 = new Computer1(mouse);
		c2.start();
		
		InputDevice joy = new JoyStick();
		Computer1 c3 = new Computer1(joy);
		c3.start();
	}
}

class Computer1 {
	private InputDevice device; // Dependency access from interface(abstraction level)
	
	public Computer1(InputDevice device) {
		this.device = device;
	}
	
	public void start() {
		device.usage();
	}
}

// abstraction => computer, mosue, keyboard
interface InputDevice {
	void usage();
}

class JoyStick implements InputDevice {

	@Override
	public void usage() {
		System.out.println("Using with joystick(USB, Hard Disk, protable drive)");
	}
	
}

class Mouse implements InputDevice {

	@Override
	public void usage() {
		System.out.println("Using with mouse.");
	}
	
}

class Keyboard1 implements InputDevice {

	@Override
	public void usage() {
		System.out.println("Typing with keyboard.");
	}
	
}

