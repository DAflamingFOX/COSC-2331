
public class Telivision {
	
	
	private int channel = 1;
	private int volume = 1;
	private boolean on = false;
	
	public Telivision() {
		
	}
	
	public Telivision(int channel, int volume, boolean on) {
		setChannel(channel);
		setVolume(volume);
		this.on = on;
	}
	
	public Telivision(Telivision tv) {
		channel = tv.channel;
		volume = tv.volume;
		on = tv.on;
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		newChannel = newChannel >= 1 ? (newChannel <= 120 ? newChannel : 120) : 1;
	}
	
	public void setVolume(int newVolumeLevel) {
		volume = newVolumeLevel >= 1 ? (newVolumeLevel <= 7 ? newVolumeLevel : 7) : 1;
	}
	
	public void channelUp() {
		setChannel(channel + 1);
	}
	
	public void channelDown() {
		setChannel (channel - 1);
	}
	
	public void volumeUp() {
		setVolume(volume + 1);
	}
	
	public void volumeDown() {
		setVolume (volume - 1);
	}
	
	@Override
	public String toString() {
		return String.format("Telivision: [On: %b, Channel: %d, Volume: %d]", on, channel, volume);
	}
}
