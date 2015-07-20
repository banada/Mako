![alt text](https://github.com/banada/Mako/blob/master/mako.png)
# Mako
Yocto layers for [MinnowBoard MAX](http://www.minnowboard.org/meet-minnowboard-max) and [Intel® Edison](https://software.intel.com/en-us/iot/hardware/edison?utm_source=Covario&utm_medium=Paid%20search&utm_content=Q2%20IoT%20SEM%20Campaign%20-%20Covario&utm_campaign=IoT%20SEM%20Covario). Built with makers in mind.

### meta-mako
Use meta-mako to build an image with development tools commonly used by makers already installed.

meta-mako depends on:
- meta-openembedded/meta-oe
- meta-openembedded/meta-python
- meta-openembedded/meta-webserver
- meta-openembedded/meta-networking
- meta-intel
- meta-intel-iot-middleware

After adding layer dependencies, run

```
bitbake mako-full
```

to build an image.

### meta-lure
Use meta-lure to add support for [MinnowBoard MAX](http://www.minnowboard.org/meet-minnowboard-max) lures to your image.

Current lures:
- Calamari Lure
