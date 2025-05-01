.class public Lcom/aggmoread/sdk/z/a/s/b;
.super Lcom/aggmoread/sdk/z/a/s/a;
.source "SourceFile"


# instance fields
.field private D:Z

.field private E:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/b;->D:Z

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/b;->E:Z

    return-void
.end method


# virtual methods
.method public b(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/b;->D:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setShowProgress "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected c()Lcom/aggmoread/sdk/z/a/s/a$i;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getPlayerControlShowType "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/a/s/b;->D:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/b;->D:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/a/s/a$i;->c:Lcom/aggmoread/sdk/z/a/s/a$i;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/a/s/a$i;->b:Lcom/aggmoread/sdk/z/a/s/a$i;

    :goto_0
    return-object v0
.end method

.method protected d()Lcom/aggmoread/sdk/z/a/s/a$i;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/a/s/a$i;->b:Lcom/aggmoread/sdk/z/a/s/a$i;

    return-object v0
.end method

.method protected g(Landroid/widget/RelativeLayout;)Landroid/widget/ProgressBar;
    .locals 16

    move-object/from16 v1, p0

    new-instance v2, Landroid/widget/RelativeLayout;

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v5, p1

    invoke-virtual {v5, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/LinearLayout;

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v6, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xf

    invoke-virtual {v6, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v9, Lcom/aggmoread/sdk/z/a/s/b$a;

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v9, v1, v0}, Lcom/aggmoread/sdk/z/a/s/b$a;-><init>(Lcom/aggmoread/sdk/z/a/s/b;Landroid/content/Context;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    const/16 v12, 0x1d

    if-lt v0, v12, :cond_0

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v0, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/widget/SeekBar;->setMaxHeight(I)V

    iget-object v0, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v0, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/widget/SeekBar;->setMaxWidth(I)V

    goto :goto_0

    :cond_0
    :try_start_0
    const-class v0, Landroid/widget/ProgressBar;

    const-string v12, "mMaxHeight"

    invoke-virtual {v0, v12}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const-class v12, Landroid/widget/ProgressBar;

    const-string v13, "mMaxWidth"

    invoke-virtual {v12, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual {v12, v8}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    iget-object v13, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v13, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v9, v13}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v12, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v12, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v0, v9, v10}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9}, Landroid/widget/SeekBar;->requestLayout()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x11

    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v9, v7, v7, v7, v7}, Landroid/widget/SeekBar;->setPadding(IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v4, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    const-wide/high16 v10, 0x4014000000000000L    # 5.0

    invoke-static {v4, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/16 v4, -0x5a

    invoke-static {v4}, Lcom/aggmoread/sdk/z/a/m/j;->a(I)Landroid/graphics/drawable/GradientDrawable$Orientation;

    move-result-object v12

    invoke-virtual {v3, v12}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    const-string v12, "#70ffffff"

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-static {v13, v14, v12}, Lcom/aggmoread/sdk/z/a/m/j;->a(III)[I

    move-result-object v12

    invoke-virtual {v3, v12}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    const/high16 v12, 0x3f000000    # 0.5f

    const/high16 v13, 0x3f400000    # 0.75f

    invoke-virtual {v3, v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setGradientCenter(FF)V

    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v15, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v15, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v15

    int-to-float v15, v15

    invoke-virtual {v14, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-static {v4}, Lcom/aggmoread/sdk/z/a/m/j;->a(I)Landroid/graphics/drawable/GradientDrawable$Orientation;

    move-result-object v15

    invoke-virtual {v14, v15}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    const-string v15, "#90ffffff"

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    invoke-static {v7, v4, v15}, Lcom/aggmoread/sdk/z/a/m/j;->a(III)[I

    move-result-object v4

    invoke-virtual {v14, v4}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    invoke-virtual {v14, v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setGradientCenter(FF)V

    new-instance v4, Landroid/graphics/drawable/ClipDrawable;

    const/4 v7, 0x3

    invoke-direct {v4, v14, v7, v8}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v15, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v15, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v14, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/16 v10, -0x5a

    invoke-static {v10}, Lcom/aggmoread/sdk/z/a/m/j;->a(I)Landroid/graphics/drawable/GradientDrawable$Orientation;

    move-result-object v10

    invoke-virtual {v14, v10}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    const-string v10, "#ffffffff"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-static {v11, v15, v10}, Lcom/aggmoread/sdk/z/a/m/j;->a(III)[I

    move-result-object v10

    invoke-virtual {v14, v10}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    invoke-virtual {v14, v12, v13}, Landroid/graphics/drawable/GradientDrawable;->setGradientCenter(FF)V

    new-instance v10, Landroid/graphics/drawable/ClipDrawable;

    invoke-direct {v10, v14, v7, v8}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    new-array v7, v7, [Landroid/graphics/drawable/Drawable;

    const/4 v11, 0x0

    aput-object v3, v7, v11

    aput-object v4, v7, v8

    const/4 v3, 0x2

    aput-object v10, v7, v3

    new-instance v4, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v4, v7}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/high16 v7, 0x1020000

    invoke-virtual {v4, v11, v7}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    const v7, 0x102000f

    invoke-virtual {v4, v8, v7}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    const v7, 0x102000d

    invoke-virtual {v4, v3, v7}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    invoke-virtual {v9, v4}, Landroid/widget/SeekBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v9, v4}, Landroid/widget/SeekBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v3, 0x0

    invoke-virtual {v9, v3}, Landroid/widget/SeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, v1, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    invoke-static {v3, v7, v8}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    invoke-virtual {v9, v3}, Landroid/widget/SeekBar;->setThumbOffset(I)V

    invoke-virtual {v5, v9, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v5, v6}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v9
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/b;->E:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
