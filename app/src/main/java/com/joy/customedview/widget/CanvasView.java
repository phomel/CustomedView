package com.joy.customedview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * desc
 * <p>
 * author : huangyacong
 * time   : 2017/4/20
 */
public class CanvasView extends View {

    private Paint mPaint;

    public CanvasView(Context context) {
        this(context, null);
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(10f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        aboutDraw(canvas);
        aboutCanvas(canvas);

    }

    /**
     * 画布相关
     */
    private void aboutCanvas(Canvas canvas) {
        //平移
        // 将整个坐标系平移了,所有画布操作只对后续绘制有影响,对已绘制的的内容无影响
//        canvas.translate(200, 200);
//        canvas.drawCircle(0, 0, 100, mPaint);
//        mPaint.setColor(Color.BLUE);
//        canvas.translate(200, 200);
//        canvas.drawCircle(0, 0, 100, mPaint);

        //缩放
        //默认缩放中心点(0,0),缩放系数>1或<-1放大,-1<系数<1缩小,负数先按比例放大缩小再翻转
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        RectF rect = new RectF(-400,-400,400,400);   // 矩形区域
//        for (int i=0; i<=20; i++)
//        {
//            canvas.scale(0.9f,0.9f);
//            canvas.scale(0.9f,0.9f, 0, 0); //默认缩放中心点(0,0),缩放正数放大
//            canvas.drawRect(rect,mPaint);
//        }

        //旋转
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//        RectF rectF = new RectF(0, -400, 400, 0);
//        canvas.drawRect(rectF, mPaint);
////        canvas.rotate(180, 0, 0);
////        canvas.rotate(180);
//        canvas.rotate(180, 200, 0);
//        mPaint.setColor(Color.BLUE);
//        canvas.drawRect(rectF, mPaint);

        //旋转栗子
        // 将坐标系原点移动到画布正中心
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//
//        canvas.drawCircle(0, 0, 400, mPaint);          // 绘制两个圆形
//        canvas.drawCircle(0, 0, 380, mPaint);
//
//        for (int i = 0; i <= 360; i += 10) {               // 绘制圆形之间的连接线
//            canvas.drawLine(0, 380, 0, 400, mPaint);
//            canvas.rotate(10);
//        }

        //错切
        //float sx:将画布在x方向上倾斜相应的角度，sx倾斜角度的tan值，
        //float sy:将画布在y轴方向上倾斜相应的角度，sy为倾斜角度的tan值.
        //X = x + sx * y, Y = sy * x + y
        // 将坐标系原点移动到画布正中心
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.translate(getWidth() / 2, getHeight() / 2);
//
//        RectF rect = new RectF(0,0,200,200);   // 矩形区域
//
//        mPaint.setColor(Color.BLACK);           // 绘制黑色矩形
//        canvas.drawRect(rect,mPaint);
//
//        //参数sx的tan值和sy的tan值
//        canvas.skew(1,0);                       // 水平错切 <- 45度
//
//        mPaint.setColor(Color.BLUE);            // 绘制蓝色矩形
//        canvas.drawRect(rect,mPaint);
    }

    /**
     * 绘制相关
     */
    private void aboutDraw(Canvas canvas) {
        //绘制点
//        canvas.drawPoint(300, 300, mPaint);
//        canvas.drawPoints(new float[]{400, 400,
//            500, 500,
//            700, 700}, mPaint);

        //绘制线
//        canvas.drawLine(100, 100, 250, 250, mPaint);
//        canvas.drawLines(new float[]{300, 400, 400, 400,
//            500, 600, 500, 700}, mPaint);

        //绘制矩形
//        canvas.drawRect(100, 100, 300, 400, mPaint);
//        canvas.drawRect(new Rect(350, 400, 550, 600), mPaint);
//        canvas.drawRect(new RectF(650, 700, 750, 750), mPaint);

        //绘制圆角矩形
//        RectF rectF = new RectF(100, 600, 400, 800);
//        canvas.drawRoundRect(rectF, 150, 100, mPaint);
//        canvas.drawRoundRect(100, 100, 400, 500, 50, 50, mPaint);

        //绘制椭圆
//        RectF rectF = new RectF(100, 100, 300, 400);
//        canvas.drawOval(rectF, mPaint);
//        canvas.drawOval(100, 500, 500, 800, mPaint);

        //绘制圆
//        canvas.drawCircle(300, 300, 100, mPaint);

        //绘制圆弧
//        RectF rectF = new RectF(100, 100, 400, 400);
//        mPaint.setColor(Color.GRAY);
//        canvas.drawRect(rectF, mPaint);
//        mPaint.setColor(Color.BLACK);
//        canvas.drawArc(rectF, 0, 90, false, mPaint);
//        //------------------------------------------
//        RectF mRectF = new RectF(100, 500, 400, 800);
//        mPaint.setColor(Color.GRAY);
//        canvas.drawRect(mRectF, mPaint);
//        mPaint.setColor(Color.BLACK);
//        //从135°扫过225°的圆弧
//        canvas.drawArc(mRectF, 135, 225, true, mPaint);

        //画笔的三种模式
//        mPaint.setColor(Color.BLUE);
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeWidth(50);
//        canvas.drawCircle(200, 200, 100, mPaint);
//
//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawCircle(200, 500, 100, mPaint);
//
//        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
//        canvas.drawCircle(200, 750, 100, mPaint);
        //线冒
        //mPaint.setStrokeCap(Paint.Cap.ROUND);设置线冒为圆头,和圆角矩形相似,只是这个设置是在画笔上的
    }
}
