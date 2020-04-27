adb shell  rm -rf /sdcard/clonedb
adb shell run-as com.example.datensammler2020 cp -r /data/data/com.example.datensammler2020/databases/. /sdcard/clonedb
adb pull /sdcard/clonedb ./