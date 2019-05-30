package yte.summerp.oopjava.encapsulation;

public class Starship {
	private String shipName;
	private int maxWarpSpeed;
	private WarpMotor warpMotor;
	private Teleportation teleportation=null;

	public Starship(String shipName) {
		this.shipName = shipName;
		warpMotor = new WarpMotor();
		teleportation = new Teleportation();
	}

	public String getShipName() {
		return shipName;
	}

	public void openWormHole(int warpSpeed) {
		warpMotor.setWarpSpeed(warpSpeed);
		warpMotor.run();
	}

	private class  Teleportation {
		private boolean teleportInProgress=false;

		public void teleportTo(SpaceCoordinate spaceCoordinate) {
		}

		public void teleportTo(String personName,SpaceCoordinate spaceCoordinate) {
			obtainTeleportRoom();
			System.out.println("Teleporting "+personName+" to "+spaceCoordinate);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			teleportInProgress = false;
		}

		private synchronized void obtainTeleportRoom() {
			while (teleportInProgress) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			teleportInProgress = true;
			notify();
		}
	}

	private class WarpMotor {
		int warpSpeed=0;

		public void setWarpSpeed(int warpSpeed) {
			this.warpSpeed=warpSpeed;
		}

		public int getWarpSpeed() {
			return warpSpeed;
		}

		private void run() {
			System.out.println("Running ship at warp speed: "+warpSpeed);
		}
	}

	public class SpaceCoordinate {
		long universeId;
		double x,y,z;

		public SpaceCoordinate(long universeId) {
			this.universeId = universeId;
		}


	}
}
