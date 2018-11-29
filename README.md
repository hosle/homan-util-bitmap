# homan-util-bitmap


Author: hosle

created at Nov 29th 2018

-----

## bitmap 压缩

```
class BitmapCompressor {

 public BitmapCompressor(String tag)

 public Bitmap compress(String file) 
}
```

## bitmap 转byteArray

```
fun bmpToByteArray(originBmp: Bitmap,destWidth:Int, destHeight:Int, needRecycle: Boolean): ByteArray
```

## bitmap 旋转

```
public class RotatedBitmapHelper {

	public RotatedBitmapHelper(String originUrl){}
	
	public Bitmap rotate(Bitmap bm){}
	
	public Bitmap rotateBitmapByDegree(Bitmap bm, int degree){}
}
```