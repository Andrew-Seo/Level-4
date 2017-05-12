package Interfaces;

public class Robot {
	Noise noise;
	 void setNoise(Noise nois){
		 noise = nois;
	 }
	 void blap(){
		 noise.noises();
	 }
}
