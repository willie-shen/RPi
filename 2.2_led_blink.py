import RPi.GPIO as GPIO
import time

# pin definitions
pwnPin = 18
ledPin = 23
butPin = 17

#brightness
duty = 75

#setup GPIO
GPIO.setmode(GPIO.BCM)
GPIO.setup(ledPin, GPIO.OUT)
GPIO.setup(pwnPin, GPIO.OUT)
GPIO.setup(butPin, GPIO.IN, pull_up_down = GPIO.PUD_UP)

pwm = GPIO.PWM(pwmPIN, 200)

GPIO.output(ledPin, GPIO.LOW)
pwm.start(duty)

try:
	while 1:
		if GPIO.input(butPin):
			pwm.ChangeDutyCycle(duty)
			GPIO.output(ledPin, GPIO.LOW)

		else:	
			pwn.ChangeDutyCycle(duty)
			GPIO.output(led, GPIO.HIGH)
			time.sleep(0.5)
			pwn.ChangeDutyCycle(100-duty)
			GPIO.output(led, GPIO.LOW)
			time.sleep(0.5)

except KeyboardInterrupt:
	pwm.stop()
	GPIO.cleanup()