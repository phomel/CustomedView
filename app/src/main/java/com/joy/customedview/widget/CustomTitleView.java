package com.joy.customedview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import com.joy.customedview.R;

import static android.util.TypedValue.COMPLEX_UNIT_PX;

/**
 * desc
 *
 * author : huangyacong
 * time   : 2017/4/20
 */
public class CustomTitleView extends View {

    private String text;
    //设置默认值
    private int color = Color.BLACK;
    private int size = (int) (TypedValue.applyDimension(COMPLEX_UNIT_PX, 25, getResources().getDisplayMetrics()));
    private Rect mRect;
    private Paint mPaint;

    public CustomTitleView(Context context) {
        this(context, null);
    }

    public CustomTitleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomTitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomTitleView, defStyleAttr, 0);
        int n = array.getIndexCount();
        for (int i = 0; i < n; i++) {
            int attr = array.getIndex(i);
            switch (attr) {
                case R.styleable.CustomTitleView_titleText:
                    text = array.getString(attr);
                    break;
                case R.styleable.CustomTitleView_titleTextColor:
                    //颜色默认值不应该在这里设,根本走不到switch-case,没设颜色值,
                    //TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomTitleView, defStyleAttr, 0);
                    //array就没有这一项,应该在for循环之前设置默认颜色值
                    color = array.getColor(attr, getResources().getColor(R.color.Black));
                    break;
                case R.styleable.CustomTitleView_titleTextSize:
                    size = array.getDimensionPixelSize(attr, (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                            16, getResources().getDisplayMetrics()));
                    break;
            }
        }
        array.recycle();
        mPaint = new Paint();
        mPaint.setTextSize(size);
//        mPaint.setColor(color);
        mRect = new Rect();
        mPaint.getTextBounds(text, 0, text.length(), mRect);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int width;
        int height;
        if (widthMode == MeasureSpec.EXACTLY) {
            width = widthSize;
        } else {
            mPaint.setTextSize(size);
            mPaint.getTextBounds(text, 0, text.length(), mRect);
//            int textWidth = mRect.width();
            float textWidth = mPaint.measureText(text);
            width = (int) (getPaddingLeft() + textWidth + getPaddingRight());
        }

        if (heightMode == MeasureSpec.EXACTLY) {
            height = heightSize;
        } else {
            mPaint.setTextSize(size);
            mPaint.getTextBounds(text, 0, text.length(), mRect);
//            int textHeight = mRect.height();
            float textHeight = mPaint.measureText(text);
            height = (int) (getPaddingBottom() + textHeight + getPaddingTop());
        }

        setMeasuredDimension(width, height);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(getResources().getColor(R.color.colorAccent));
//        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), mPaint);
//        mPaint.setColor(color);
        canvas.drawText(text, getWidth() / 2 - mRect.width() / 2, getHeight() / 2 - mRect.height() / 2, mPaint);
    }
}
