.class public Lcom/aggmoread/sdk/z/a/o/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/t/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/o/a$d;
    }
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Lcom/aggmoread/sdk/z/c/a/a/e/l;

.field private c:Lcom/aggmoread/sdk/z/a/g/g;

.field private d:Lcom/aggmoread/sdk/z/a/o/a$d;

.field private e:Lcom/aggmoread/sdk/z/a/r/a;

.field private f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/o/a;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/a/o/a$d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/o/a;->d:Lcom/aggmoread/sdk/z/a/o/a$d;

    return-object p0
.end method

.method private c()Landroid/view/View;
    .locals 15

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-string v1, "#50000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    const-wide v4, 0x4072c00000000000L    # 300.0

    invoke-static {v3, v4, v5}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    const-wide v5, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5, v6}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x11

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    const-wide/high16 v5, 0x4018000000000000L    # 6.0

    invoke-static {v4, v5, v6}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    const/high16 v7, -0x1000000

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    invoke-static {v7, v8, v4, v9, v9}, Lcom/aggmoread/sdk/z/a/m/b;->a(IFIII)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/widget/FrameLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout;

    iget-object v10, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-direct {v2, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v10, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v11, -0x1

    invoke-direct {v10, v11, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v10, 0x1

    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v10, Lcom/aggmoread/sdk/z/c/a/a/e/l;

    iget-object v12, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-direct {v10, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/l;-><init>(Landroid/content/Context;)V

    iput-object v10, p0, Lcom/aggmoread/sdk/z/a/o/a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/l;

    int-to-float v4, v4

    invoke-virtual {v10, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/l;->a(F)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v8, v4, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object v10, p0, Lcom/aggmoread/sdk/z/a/o/a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/l;

    invoke-virtual {v10, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/l;

    sget-object v10, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/l;

    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/l;

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    iget-object v7, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-direct {v4, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v4, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v7, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    invoke-static {v7, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v7

    iget-object v12, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    const-wide/high16 v13, 0x4034000000000000L    # 20.0

    invoke-static {v12, v13, v14}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget-object v12, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    invoke-virtual {v12, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    const-string v12, "\u67e5\u770b\u8be6\u60c5"

    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    const-string v12, "#ffffff"

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    const/high16 v12, 0x41700000    # 15.0f

    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    invoke-virtual {v4, v7, v7, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setGravity(I)V

    const-string v3, "#0a81fc"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-static {v4, v5, v6}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    invoke-static {v3, v8, v4, v9, v9}, Lcom/aggmoread/sdk/z/a/m/b;->a(IFIII)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    const-wide/high16 v5, 0x4038000000000000L    # 24.0

    invoke-static {v4, v5, v6}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    iget-object v7, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-static {v7, v5, v6}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x35

    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-static {v4, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    invoke-static {v4, v10, v11}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-string v3, "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAAXNSR0IArs4c6QAAAmZJREFUWEfVlzloFmEQhp+30FIQQVAUBK9ORLQQDyKS1IKaWkjpFQUbU6igQbTQJJYGe2PAq9LCI9opqJ0HaCEKKe3ldT+ZHzabvRIDiwvbfNc8O/POzLei40cd2+f/ArC9ExgA+oG1wJrw4E/gB3APmJH0oa1nW3nA9j7gNHC4cPA34DewsTA+DYxJmmkCaQSwfQU4Hwe9A14Bb4HnkhIAttcBu+M9CGyL9ROSTtVB1ALYTsb2xAHXgcuSftUdaHs1cAs4Guu+SNpctacSwPZnYFNsHJD0tMmd+XnbKWQ3Y+y1pL1l+0sBbI8DJ9MGSY1havCIY35U0khx7bzDQ3AvY+GwpLGFfHlxre2UMU9ifH9RmGUAKZWS2qckDfYOtN2XCa8vc8jFhi8eBu73BBoivQacA6YlHcnvnwNgO6n3PZDyuF/SbA4gGb5QBCvE/W6I71Ie1PYK4EUGth3YJelNb18R4Hgo+Eam9rMl7uwZmOOd+MrKuZifAE4AI5JGqwCeJTcDg5Kmylxte56hsrES+GPAnagfB6oAPgJbgPWSvlfFOm8w1qScn+eVQng2AF+BT5K2VgGkIjMrqZf/lXrLQaQ1tcZzOkoAqyQlTfx9ihroHGAxIVgGHGrygu1WIViwCG0vBx5Fm64Mhe1WIlxUGtpeCTwEUr0vhbDdKg3rCtEQcLvGQGrJDzKQHcAZSb1GlNp1u0IUBaO0FMfckKTJmvRM6XU1S+NJSY9z6m9XisNIuv1014wCort2nHNbdxeSHER3V7IcRHeX0hxEd9fyQkfr5seksiUuwcQ/3XiXwH73P6d/AMNtZjBWZp4QAAAAAElFTkSuQmCC"

    invoke-static {v2, v3}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    new-instance v3, Lcom/aggmoread/sdk/z/a/o/a$a;

    invoke-direct {v3, p0}, Lcom/aggmoread/sdk/z/a/o/a$a;-><init>(Lcom/aggmoread/sdk/z/a/o/a;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance v2, Lcom/aggmoread/sdk/z/a/o/a$b;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/z/a/o/a$b;-><init>(Lcom/aggmoread/sdk/z/a/o/a;)V

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/a/r/a;->a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/r/a$a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object v2

    iput-object v2, p0, Lcom/aggmoread/sdk/z/a/o/a;->e:Lcom/aggmoread/sdk/z/a/r/a;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/c/a/a/e/l;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/o/a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/l;

    return-object p0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/a/r/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/o/a;->e:Lcom/aggmoread/sdk/z/a/r/a;

    return-object p0
.end method

.method private d()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/a;->d:Lcom/aggmoread/sdk/z/a/o/a$d;

    if-eqz v0, :cond_0

    const v1, 0xc356

    const-string v2, "\u7d20\u6750\u52a0\u8f7d\u5931\u8d25"

    invoke-interface {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/o/a$d;->a(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/a/o/a;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/o/a;->f:Landroid/widget/TextView;

    return-object p0
.end method

.method private e()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/a;->c:Lcom/aggmoread/sdk/z/a/g/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/o/a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/l;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/g/g;->a:Ljava/lang/String;

    new-instance v1, Lcom/aggmoread/sdk/z/a/o/a$c;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/a/o/a$c;-><init>(Lcom/aggmoread/sdk/z/a/o/a;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/aggmoread/sdk/z/a/p/a;->a(Ljava/lang/String;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$g;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/a;->d()V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/a/o/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/a;->d()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/a;->a:Landroid/app/Activity;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/a;->c()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/o/a;->e()V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/o/a;->c:Lcom/aggmoread/sdk/z/a/g/g;

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/o/a$d;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/o/a;->d:Lcom/aggmoread/sdk/z/a/o/a$d;

    return-void
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public onPause()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 0

    return-void
.end method
