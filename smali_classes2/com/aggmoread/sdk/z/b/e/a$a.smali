.class Lcom/aggmoread/sdk/z/b/e/a$a;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/b/e/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/b/e/a$b;

.field private b:Lcom/aggmoread/sdk/z/a/t/h;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Landroid/view/ViewGroup;

.field final synthetic f:Lcom/aggmoread/sdk/z/b/e/a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/b/e/a;Landroid/content/Context;Ljava/lang/String;Lcom/aggmoread/sdk/z/b/e/a$b;)V
    .locals 3
    .param p1    # Lcom/aggmoread/sdk/z/b/e/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->f:Lcom/aggmoread/sdk/z/b/e/a;

    const-string v0, "CustomDialog1"

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/e/a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, p2, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object p4, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->a:Lcom/aggmoread/sdk/z/b/e/a$b;

    new-instance p4, Landroid/widget/LinearLayout;

    invoke-direct {p4, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p2}, Lcom/aggmoread/sdk/z/b/e/a$a;->a(Landroid/content/Context;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->c:Landroid/view/View;

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p4, p2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {p0, p4}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->d:Landroid/view/View;

    new-instance p4, Lcom/aggmoread/sdk/z/b/e/a$a$a;

    invoke-direct {p4, p0, p1}, Lcom/aggmoread/sdk/z/b/e/a$a$a;-><init>(Lcom/aggmoread/sdk/z/b/e/a$a;Lcom/aggmoread/sdk/z/b/e/a;)V

    invoke-virtual {p2, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->e:Landroid/view/ViewGroup;

    new-instance p4, Lcom/aggmoread/sdk/z/b/e/a$a$b;

    invoke-direct {p4, p0, p1}, Lcom/aggmoread/sdk/z/b/e/a$a$b;-><init>(Lcom/aggmoread/sdk/z/b/e/a$a;Lcom/aggmoread/sdk/z/b/e/a;)V

    invoke-virtual {p2, p4}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->b:Lcom/aggmoread/sdk/z/a/t/h;

    new-instance p4, Lcom/aggmoread/sdk/z/b/e/a$a$c;

    invoke-direct {p4, p0, p1}, Lcom/aggmoread/sdk/z/b/e/a$a$c;-><init>(Lcom/aggmoread/sdk/z/b/e/a$a;Lcom/aggmoread/sdk/z/b/e/a;)V

    invoke-virtual {p2, p4}, Lcom/aggmoread/sdk/z/a/t/h;->a(Lcom/aggmoread/sdk/z/a/t/h$d;)V

    new-instance p2, Lcom/aggmoread/sdk/z/b/e/a$a$d;

    invoke-direct {p2, p0, p1}, Lcom/aggmoread/sdk/z/b/e/a$a$d;-><init>(Lcom/aggmoread/sdk/z/b/e/a$a;Lcom/aggmoread/sdk/z/b/e/a;)V

    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->d()Ljava/lang/String;

    move-result-object p1

    const-string p2, "/api/getSdkAds"

    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->b:Lcom/aggmoread/sdk/z/a/t/h;

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/b/e/a$a;)Lcom/aggmoread/sdk/z/b/e/a$b;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->a:Lcom/aggmoread/sdk/z/b/e/a$b;

    return-object p0
.end method

.method private a(Landroid/content/Context;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v10, -0x1

    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    const/4 v11, 0x1

    invoke-virtual {v9, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v8, v1, v2}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v1

    invoke-virtual {v9, v1, v1, v1, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    new-instance v1, Landroid/widget/RelativeLayout;

    invoke-direct {v1, v8}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v3, -0x1000000

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v11}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v3, 0x41900000    # 18.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v3, "\u5e94\u7528\u4fe1\u606f"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v3, v12, v12}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0xd

    invoke-virtual {v3, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v14, Landroid/widget/ImageView;

    invoke-direct {v14, v8}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-string v2, "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAABaklEQVRYR+2VP0vEQBDF31tsBfHTWO5saWOjoOefQq5RK0v9AtpZqYVi4X9QCyutJqn8OqK1OLKSwBHPu9wtEoSkTObN/PJ2ZpZo+GHD9dECtA60Dgx1QFUfAMw457re+6c6Y6uqswBOSL6IyMIgzVCALMveAUwC+DCz+RDC46CEqjpH8h7AhJm9hRCmkgBUtUPyEgDN7JPkmohc9UuaZdmymZ2TdADMzFZCCNdJAFEcEwO4iBBF4m4I4aw3saqukzwtYwCs/gbaqxt6BGVwBQIkN733x/F7nucbZnZUxFrd4jG+NkAfJ+Kr7aLowTjFRwaIgorVvW6O9OelcCQHSlEfiNhwP/qizsj+P4BGj6A6CQB2Cpv3/rwJGx3DRhdRnudLZhZX7/cqds4teu/v6qxiAB0RuU1axSmXEYBXEZlOBdg3swWSWyLyXGe243VM8tDMbkIIu0kAdQqmxIy1iFIKVrUtQOtA68AX4HzJIQMvlE8AAAAASUVORK5CYII="

    invoke-static {v14, v2}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const-wide/high16 v3, 0x4034000000000000L    # 20.0

    invoke-static {v8, v3, v4}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v5

    invoke-static {v8, v3, v4}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    invoke-direct {v2, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0xf

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v3, 0xb

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v1, v14, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const-wide/high16 v3, 0x4049000000000000L    # 50.0

    invoke-static {v8, v3, v4}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    invoke-direct {v2, v10, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/FrameLayout;

    invoke-direct {v1, v8}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v15, Lcom/aggmoread/sdk/z/a/t/h;

    invoke-direct {v15, v8}, Lcom/aggmoread/sdk/z/a/t/h;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v10, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v15, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const-wide v3, 0x4072c00000000000L    # 300.0

    invoke-static {v8, v3, v4}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    invoke-direct {v2, v10, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/widget/RelativeLayout;

    invoke-direct {v7, v8}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/16 v3, 0xff

    const/16 v4, 0xb

    const/16 v5, 0x5d

    const/16 v6, 0xe6

    const/16 v16, 0x5a

    move-object v1, v7

    move-object/from16 v2, p1

    move-object v13, v7

    move/from16 v7, v16

    invoke-static/range {v1 .. v7}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/view/View;Landroid/content/Context;IIIII)V

    const-wide/high16 v1, 0x402e000000000000L    # 15.0

    invoke-static {v8, v1, v2}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    invoke-virtual {v13, v3, v3, v3, v3}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v4, "\u7acb\u5373\u4e0b\u8f7d"

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v4, 0x41700000    # 15.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-static {v11}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v4, v12, v12}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0xd

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v13, v3, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v3, v10, v12}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    invoke-static {v8, v1, v2}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    invoke-static {v8, v1, v2}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v1

    iput v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    invoke-static {v8, v1, v2}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v1

    iput v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v9, v13, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v9, v0, Lcom/aggmoread/sdk/z/b/e/a$a;->c:Landroid/view/View;

    iput-object v14, v0, Lcom/aggmoread/sdk/z/b/e/a$a;->d:Landroid/view/View;

    iput-object v13, v0, Lcom/aggmoread/sdk/z/b/e/a$a;->e:Landroid/view/ViewGroup;

    iput-object v15, v0, Lcom/aggmoread/sdk/z/b/e/a$a;->b:Lcom/aggmoread/sdk/z/a/t/h;

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/b/e/a$a;)Lcom/aggmoread/sdk/z/a/t/h;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->b:Lcom/aggmoread/sdk/z/a/t/h;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/e/a$a;->f:Lcom/aggmoread/sdk/z/b/e/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/e/a;->a(Lcom/aggmoread/sdk/z/b/e/a;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/16 v2, 0x50

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 v2, -0x1

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    const/4 v2, -0x2

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    const-string v2, "CustomAnim"

    invoke-static {v2}, Lcom/aggmoread/sdk/z/b/e/a;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/Window;->setWindowAnimations(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public show()V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/b/e/a$a;->a()V

    invoke-super {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method
