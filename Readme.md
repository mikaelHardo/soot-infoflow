This is a fork of the flowdroid repository containing the changes needed to make [didfail](http://www.cs.cmu.edu/~wklieber/didfail/) work.
We use this, to run didfail with the newest build of flowdroid.


soot-infoflow
=====================
soot-infoflow is part of FlowDroid, a context-, flow-, field-, object-sensitive and lifecycle-aware static taint analysis tool for Android applications.

Dependencies
---------------------
If you want to develop or customize FlowDroid or checkout all components on their own you need to take 
care of the following dependencies:

- [soot-infoflow-android](https://github.com/secure-software-engineering/soot-infoflow-android.git)
- [Soot](http://github.com/Sable/soot.git)
- [Heros](http://github.com/Sable/heros.git)
- [Jasmin](http://github.com/Sable/jasmin.git)

Build Script
---------------------
coming soon.

Manual
---------------------
The soot.jimple.infoflow.Infoflow class should be used to start an analysis.
If you want to start an analysis on an Android apk file you have to use the
soot.jimple.infoflow.android.TestApps.Test class


For more information visit http://sseblog.ec-spride.de/android/flowdroid/

