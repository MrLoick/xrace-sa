<h3>What is XRace</h3>(http://code.google.com/p/xrace-sa/)

XRace is a 3D car race game for the Android mobile phone platform, using OpenGL ES for rendering. More than the other classic car race games, this one provides additional operation modes, which is “sensor controlling”. We can use the orientation sensor to control the car. Without the real hardware you can run this game with a “sensor simulator”, which developed by Group Openintents.
(Learn more from this URL http://code.google.com/p/openintents/ ).

<h3>How to Run this Game</h3>

  1. Install the OpenIntents on your emulator.
> > Download the openintents-binary-0.9.0.zip from
> > http://code.google.com/p/openintents/downloads/list


> Type the follow command on your console<br>
<blockquote>cd $Android-sdk-home$/tools<br>
emulator -wipe-data<br></blockquote>

<blockquote>2)When Emulator opened (automaticaly by the command above).</blockquote>

<blockquote>Use the following command for installing the openintents.apk on you emulator. <br>
Type the follow command on your console<br>
> adb  install d:/openintents.apk</blockquote>

<blockquote><a href='http://xrace-sa.googlecode.com/files/01.JPG'>http://xrace-sa.googlecode.com/files/01.JPG</a></blockquote>

<blockquote>3)Set up the IP address and Socket for Open Intents<br>
<blockquote>Open the OpenIntents. Select the “Settings” Tab. <br>
Check the Sensor simulator, and then input you IP address and Socket.</blockquote></blockquote>

<blockquote><a href='http://xrace-sa.googlecode.com/files/02.JPG'>http://xrace-sa.googlecode.com/files/02.JPG</a></blockquote>

<blockquote>4)Test the OpenIntents.<br>
<blockquote>Run sensorsimulator.jar. Which located in folder openintents-binary-0.9.0/tools/ .<br>
And then Select the “Testing” tab and then check the connection.</blockquote></blockquote>

<blockquote><a href='http://xrace-sa.googlecode.com/files/03.JPG'>http://xrace-sa.googlecode.com/files/03.JPG</a></blockquote>

<blockquote><a href='http://xrace-sa.googlecode.com/files/04.JPG'>http://xrace-sa.googlecode.com/files/04.JPG</a></blockquote>

<blockquote>Select the slide bar “orientation”. Drag it. You can find the data changing</blockquote>

<blockquote><a href='http://xrace-sa.googlecode.com/files/05.JPG'>http://xrace-sa.googlecode.com/files/05.JPG</a></blockquote>

<blockquote>It means you have successfully connected the simulator with OpenIntents.<br>
</blockquote><blockquote>5)Install the XRace.apk , the same as step 2)<br>
<blockquote>>adb  install d:/XRace.apk</blockquote></blockquote>

<blockquote>6)Open the XRaceServer.jar. Start the Server</blockquote>

<a href='http://xrace-sa.googlecode.com/files/06.JPG'>http://xrace-sa.googlecode.com/files/06.JPG</a>

<blockquote>7)Then you can run XRace.<br>
<blockquote>Focus on emulator window<br>
Turn the “NumLock”(key board) light on, strike key “7” , <br>
change the emulator to horizontal screen. <br>
Then click the "muitiple".(for now version 1.0 "single" is the same as "multiple")</blockquote></blockquote>

<blockquote><a href='http://xrace-sa.googlecode.com/files/07.JPG'>http://xrace-sa.googlecode.com/files/07.JPG</a></blockquote>

<blockquote>8)Enter the Server IP, on which runs XRaceServer.jar.</blockquote>

<blockquote><a href='http://xrace-sa.googlecode.com/files/08.JPG'>http://xrace-sa.googlecode.com/files/08.JPG</a></blockquote>

<blockquote>9)Then it may take several minutes to load. Depends on your computer</blockquote>

<blockquote><a href='http://xrace-sa.googlecode.com/files/09.JPG'>http://xrace-sa.googlecode.com/files/09.JPG</a></blockquote>

<ol><li>)Strike “up”, use the “right” and “left” to select your car.</li></ol>

<blockquote><a href='http://xrace-sa.googlecode.com/files/10.JPG'>http://xrace-sa.googlecode.com/files/10.JPG</a></blockquote>

<ol><li>)Strike “Down” to finish car selecting, and then strike “Enter” to run the game.</li></ol>

<blockquote><a href='http://xrace-sa.googlecode.com/files/11.JPG'>http://xrace-sa.googlecode.com/files/11.JPG</a></blockquote>

<blockquote>You car control the car both by keyboard and sensor simulator.<br>
While you are using the simulator, Sensor “Pitch” controls the direction and the “Roll” controls the speed.</blockquote>

<h3>Development Environment</h3>

The code is currently developed using the Eclipse with the ADT plugin.<br>
The current Android SDK is Android-windows-1.0.<br>
Developed upon PC with Intel® Core™2 Duo CPU E4600 2.4GHz,2.0GB RAM<br>

<h3>Problems Found</h3><br>

<ol><li>Emulator speed. The emulator speed is very “unacceptable” when running the XRace.<br>
</li></ol><blockquote>2.Without Blue Tooth API.(Interface reserved for further programming).<br>
3.Insufficient collision handle.<br>
4.Several bugs known.<br>
5.Game experience improving.<br></blockquote>

<h3>Project Introduction</h3>

<blockquote>This project was initiated by group "android research" from SierraAtlantic.</blockquote>

<blockquote>Start Time : 2008.10.7</blockquote>

<blockquote>End Time: Still active</blockquote>

<blockquote>PM: CNan</blockquote>

<blockquote>Members: Cpan Darktemplar Jlin Yyang Sliao Jhuang Yzhong Micheal