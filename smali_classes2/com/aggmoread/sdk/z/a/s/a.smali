.class public Lcom/aggmoread/sdk/z/a/s/a;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/s/a$g;,
        Lcom/aggmoread/sdk/z/a/s/a$h;,
        Lcom/aggmoread/sdk/z/a/s/a$i;
    }
.end annotation


# instance fields
.field private A:Landroid/view/View$OnClickListener;

.field private B:Landroid/view/View$OnClickListener;

.field private C:Landroid/view/View$OnClickListener;

.field private a:Lcom/aggmoread/sdk/z/a/s/a$g;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/StringBuilder;

.field private g:Ljava/util/Formatter;

.field private h:Landroid/widget/ProgressBar;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/ImageButton;

.field private m:Landroid/widget/ImageButton;

.field private n:Landroid/widget/ImageButton;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/LinearLayout;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/widget/ImageView;

.field protected t:Landroid/content/Context;

.field private u:Landroid/widget/TextView;

.field private v:Lcom/aggmoread/sdk/z/a/s/a$h;

.field private w:Landroid/os/Handler;

.field x:Z

.field private y:Landroid/view/View$OnTouchListener;

.field private z:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->b:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->d:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->e:Z

    sget-object v1, Lcom/aggmoread/sdk/z/a/s/a$i;->d:Lcom/aggmoread/sdk/z/a/s/a$i;

    new-instance v1, Landroid/os/Handler;

    new-instance v2, Lcom/aggmoread/sdk/z/a/s/a$a;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/z/a/s/a$a;-><init>(Lcom/aggmoread/sdk/z/a/s/a;)V

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->x:Z

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/a$b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/s/a$b;-><init>(Lcom/aggmoread/sdk/z/a/s/a;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->y:Landroid/view/View$OnTouchListener;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/a$c;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/s/a$c;-><init>(Lcom/aggmoread/sdk/z/a/s/a;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->z:Landroid/view/View$OnClickListener;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/a$d;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/s/a$d;-><init>(Lcom/aggmoread/sdk/z/a/s/a;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->A:Landroid/view/View$OnClickListener;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/a$e;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/s/a$e;-><init>(Lcom/aggmoread/sdk/z/a/s/a;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->B:Landroid/view/View$OnClickListener;

    new-instance v0, Lcom/aggmoread/sdk/z/a/s/a$f;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/s/a$f;-><init>(Lcom/aggmoread/sdk/z/a/s/a;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->C:Landroid/view/View$OnClickListener;

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/a;)I
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->k()I

    move-result p0

    return p0
.end method

.method private a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/s/a$g;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/IncompatibleClassChangeError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    new-instance p1, Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {p1, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    invoke-virtual {p0, p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->y:Landroid/view/View$OnTouchListener;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->b(Landroid/widget/RelativeLayout;)V

    return-void
.end method

.method private a(Landroid/view/View;I)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, p2, :cond_0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private a(Landroid/widget/RelativeLayout;)V
    .locals 3

    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    const-string v2, "iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoV2luZG93cykiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6MUVBRDQ1QjczNTA2MTFFNUFGNTk5NTgwNjE0RTM2MzYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6MUVBRDQ1QjgzNTA2MTFFNUFGNTk5NTgwNjE0RTM2MzYiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDoxRUFENDVCNTM1MDYxMUU1QUY1OTk1ODA2MTRFMzYzNiIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDoxRUFENDVCNjM1MDYxMUU1QUY1OTk1ODA2MTRFMzYzNiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PtvEHoEAAAa+SURBVHja7F1NTFxV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"

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-direct {p0, v1, v2}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/s/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->e:Z

    return p1
.end method

.method private b()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/s/a$g;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/s/a$g;->b()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/s/a$g;->d()V

    :goto_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->q()V

    return-void
.end method

.method private b(I)V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x8

    const/4 v2, 0x3

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    const/4 v2, 0x7

    if-eq p1, v2, :cond_0

    goto :goto_2

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v0}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    invoke-direct {p0, p1, v0}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    invoke-direct {p0, p1, v0}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    :goto_0
    invoke-direct {p0, p1, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    :goto_1
    invoke-direct {p0, p1, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    :goto_2
    return-void
.end method

.method private b(Landroid/widget/RelativeLayout;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->f(Landroid/widget/RelativeLayout;)V

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/widget/RelativeLayout;)V

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->d(Landroid/widget/RelativeLayout;)V

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->c(Landroid/widget/RelativeLayout;)V

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->e(Landroid/widget/RelativeLayout;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->h()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->f:Ljava/lang/StringBuilder;

    new-instance p1, Ljava/util/Formatter;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->f:Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->g:Ljava/util/Formatter;

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/s/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/aggmoread/sdk/z/a/s/a;->c:Z

    return p0
.end method

.method private c(I)Ljava/lang/String;
    .locals 7

    div-int/lit16 p1, p1, 0x3e8

    rem-int/lit8 v0, p1, 0x3c

    div-int/lit8 v1, p1, 0x3c

    rem-int/lit8 v1, v1, 0x3c

    div-int/lit16 p1, p1, 0xe10

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->f:Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    const/4 v2, 0x1

    const/4 v4, 0x2

    if-lez p1, :cond_0

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/s/a;->g:Ljava/util/Formatter;

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v6, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v6, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v6, v4

    const-string p1, "%d:%02d:%02d"

    invoke-virtual {v5, p1, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->g:Ljava/util/Formatter;

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v2

    const-string v0, "%02d:%02d"

    invoke-virtual {p1, v0, v4}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move-result-object p1

    goto :goto_0
.end method

.method private c(Landroid/widget/RelativeLayout;)V
    .locals 9

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    const-string v3, "#ff000000"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    const/16 v3, 0x11

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    const/16 v4, 0x8

    invoke-direct {p0, v2, v4}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    new-instance v2, Landroid/widget/ProgressBar;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v2, v4}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    const-wide/high16 v6, 0x4042000000000000L    # 36.0

    invoke-static {v5, v6, v7}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v5

    iget-object v8, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v8, v6, v7}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v6

    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/widget/ProgressBar;->setBackgroundColor(I)V

    new-instance v5, Landroid/graphics/drawable/RotateDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/RotateDrawable;-><init>()V

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x15

    if-lt v6, v7, :cond_0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-string v7, "iVBORw0KGgoAAAANSUhEUgAAAG4AAABuCAMAAADxhdbJAAAAYFBMVEUAAAD///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////98JRy6AAAAIHRSTlMAswGsBQsCFXilf3KFJR+WVqGKj2YtnE88D19rNEdCsCgMELYAAAU2SURBVGjetNbd0powEAbgd4GgYEIDiIgGuP+7rAedadkknxC2z6kzuNm/BIcos9j7TXf9h76+7TJM+D8KY+sH+Sr9cgqyprnOKW7V40XuXIte6at+FMnr5V7RPvnV4CRT0xGdy5Cuqemo3iHR9F4pQd0gQTZXlGZ9Fcc7RFO6XwbHPCs6Y7Ul9ivedJae9ieyo/Nag32aliTkDnsMOcXl/c0uznwMz8W+ux836YzvXB5fxNYUfFya+RrvqhHfuDU2vYtCWOFusRBtWibz1wU/UWObcr4mmJjKKnxTzA8KeSLuEopxvSvsUY45+XITj7AnX2f2z+s1lJpoGd6B4MYMB7gqEG+BoCd5HgbHTB157uFU+JFpBSZp3Tr4Mk3crUCCkbhWwTP7SciQZFmJeYObKj/lqfzIh69decuQzBLTs481PAG6wAl3YmZs1HwCFM4oNf/eJnrjr55zpvan49XeIj9rWNnxyn8qx/cOq6xE+ZZoW+YNzlMP1px/f8lp4wUJfAWbyFhWCiK6yGrR/IEhY2CnKP407bqtnIKQLngxzLxyUhxbi8Ghu0BKtm3ONsNHse1LDTk20JsD3zZisktgV1neKIJ6+tfVL52GpNe2ePhoY8tZfvQmQPFyCuJt6HgAeQlRHU/dwva2rDt/bVk2+ZL4xqr5XWchy/HcXdmdK6vZviB4MR1kTdtG5GNnIKukDSBnfydse5eW4IMorKJ/qd+919uSojAQgOFsOK6QIEgGEND3f8vt7jQTYnZcD3H/qhnnaj67Q8ry09N5H3lX+eGz8x/8TojO401sbrz5LC33h5mM8aDwy0mTCjEnOy0ZImtSTs0vrtVSiGOSXL+1pI/Oyaziz/IiB+6SQFcowQ6xOaxY+37QeY6cSfa1MjLHgWW5gqFrQhUf5kQLlAMvH+Fym4AO1uJfVVwt5I7W4do0LsfxLqGFoatFl9gct3EZY/xSxdcch9XJvt9ZfI49QQ2elqzxOU5Q2p+uSeNrzNm6b4oaPzUcN2ya9bo8kpb/nZt+A+Vq10gaFXKiwsnYgpopBpfbQk0YhFhDcI4xXApZkC+dq2YNMMrE0NjjxK7F175Ob6+TMAbxRXrvpfa8r69KRtFcwsu0LXGsfTXHt7T8VsuFX+kw1JpmfEfLsiwYzku3DiPvtLyjpehlwXCuI1mMIQfe67MxuJEiKO1IYw86da/tExzL0R8E5iJMeRhy3Spf0KZsYm4jUQsbNsvuErjunD2rZRNEniN/2HkJDGI8HFbq545tKgr2XD+taKob7tTQcDW0pk+MVmATFWhh+uQ48GryKvXoqRVb1rPivXdrWMN4vMPhcNYPYVrrwhdJu9dIGnvMIajkP9aolVI7b9pAcb8VNMYcV5blPE53BlPGGPL8AUMt9JjjZR6Iw6rzWIQ3SGbaLMtiIMs5EbQH7u3YgYQ/EGgUcdA8jErb/wIXuNDKjBR6xKm999CllQYhq0GOI6/v+zN0hIZ1XS8Xy7G3DcjaY+lDRxgdXe005OYdNwC395TnpY9f1544G2rklRuHEcfzBeNBoD2eXOtuw3zOH484ApnbvEmKp1JlHXiWY4+43T4NcyRm4tmyoXZHx5w/HoM8H07HIizyhfSMHuZz/HRunH98Bkd7LblUB5s/3S0HoOMKKV4uZbCkNg5B4vzjQw32+Fa56W+32d/MBxpzRS7er1gr9pij3NOyjiNyapIiTrka5j03g8beAAGGW4zaZIbZPSvgQXaXi8qk+ESZXsbheO7tfMfhsqgiE/+h9MV5/gCFR4YPq8+2SgAAAABJRU5ErkJggg=="

    invoke-static {v6, v7}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/content/res/Resources;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/RotateDrawable;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/RotateDrawable;->setFromDegrees(F)V

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/RotateDrawable;->setPivotX(F)V

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/RotateDrawable;->setPivotY(F)V

    const/high16 v6, 0x43b40000    # 360.0f

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/RotateDrawable;->setToDegrees(F)V

    :cond_0
    invoke-virtual {v2, v5}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-string v6, "mDuration"

    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const/16 v3, 0x3e8

    invoke-virtual {v5, v2, v3}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->u:Landroid/widget/TextView;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    invoke-static {v3, v4, v5}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->u:Landroid/widget/TextView;

    const-string v4, "\u52a0\u8f7d\u4e2d..."

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->u:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->u:Landroid/widget/TextView;

    const/16 v3, 0xd

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/widget/TextView;I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->u:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/s/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->p()V

    return-void
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/s/a;)Lcom/aggmoread/sdk/z/a/s/a$g;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    return-object p0
.end method

.method private d(Landroid/widget/RelativeLayout;)V
    .locals 3

    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->r:Landroid/widget/RelativeLayout;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->r:Landroid/widget/RelativeLayout;

    const-string v2, "#7f000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->r:Landroid/widget/RelativeLayout;

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setGravity(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->g(Landroid/widget/RelativeLayout;)Landroid/widget/ProgressBar;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->h:Landroid/widget/ProgressBar;

    if-eqz v1, :cond_0

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/a/s/a;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    return-object p0
.end method

.method private e(Landroid/widget/RelativeLayout;)V
    .locals 7

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    const-string v3, "#ff000000"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    const/16 v3, 0x11

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    const/16 v3, 0x8

    invoke-direct {p0, v2, v3}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    new-instance v2, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v5, "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"

    invoke-static {v2, v5}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    invoke-static {v4, v5, v6}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v4

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const-string v4, "\u51fa\u9519\u4e86!"

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v1, 0xd

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/widget/TextView;I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->p:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->o:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    return-void
.end method

.method private f(Landroid/widget/RelativeLayout;)V
    .locals 4

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    invoke-static {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    const-string v2, "#7f000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/a;->j()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/a;->d()Lcom/aggmoread/sdk/z/a/s/a$i;

    move-result-object v0

    sget-object v1, Lcom/aggmoread/sdk/z/a/s/a$i;->b:Lcom/aggmoread/sdk/z/a/s/a$i;

    if-ne v0, v1, :cond_0

    const/16 v2, 0x8

    :cond_0
    invoke-direct {p0, p1, v2}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    return-void
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/a/s/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->f()V

    return-void
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/a/s/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/aggmoread/sdk/z/a/s/a;->b:Z

    return p0
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->requestFocus()Z

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->z:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->m:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->m:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->A:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->m:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->s:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->C:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->B:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    return-void
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/a/s/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->b()V

    return-void
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/a/s/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/aggmoread/sdk/z/a/s/a;->e:Z

    return p0
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/a/s/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->r()V

    return-void
.end method

.method private k()I
    .locals 5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    if-eqz v0, :cond_6

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->c:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/s/a$g;->f()I

    move-result v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {v1}, Lcom/aggmoread/sdk/z/a/s/a$g;->e()I

    move-result v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->h:Landroid/widget/ProgressBar;

    if-eqz v2, :cond_3

    if-lez v1, :cond_2

    int-to-float v2, v0

    int-to-float v3, v1

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->v:Lcom/aggmoread/sdk/z/a/s/a$h;

    if-eqz v3, :cond_1

    invoke-interface {v3, v2}, Lcom/aggmoread/sdk/z/a/s/a$h;->a(F)V

    :cond_1
    const/high16 v3, 0x447a0000    # 1000.0f

    mul-float v2, v2, v3

    float-to-long v2, v2

    iget-object v4, p0, Lcom/aggmoread/sdk/z/a/s/a;->h:Landroid/widget/ProgressBar;

    long-to-int v3, v2

    invoke-virtual {v4, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_2
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {v2}, Lcom/aggmoread/sdk/z/a/s/a$g;->g()I

    move-result v2

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/s/a;->h:Landroid/widget/ProgressBar;

    mul-int/lit8 v2, v2, 0xa

    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setSecondaryProgress(I)V

    :cond_3
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->i:Landroid/widget/TextView;

    if-eqz v2, :cond_4

    invoke-direct {p0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->j:Landroid/widget/TextView;

    if-eqz v1, :cond_5

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/a/s/a;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    return v0

    :cond_6
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private p()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->e:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    return-void
.end method

.method private q()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/s/a$g;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    const-string v1, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4BAMAAABaqCYtAAAAGFBMVEUAAAD///////////////////////////8jfp1fAAAAB3RSTlMAHvq+4MgxaI51OgAAAElJREFUOMtjGAXUAMLq5UVhIEYqkGGIJmleXl5eAmK4AxnFaJLq5UAgwMDACKKL0CTLkSXLRyVHJUcl4ZJ4MxLeLIg/844CKgAA/gibZXJbivoAAAAASUVORK5CYII="

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    const-string v1, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAQlBMVEUAAAD///////////////////////////////////////////////////////////////////////////////////8IX9KGAAAAFXRSTlMAtPD8DgOeNOO+Vicd26l5PsqEYoeGu3ayAAAAlElEQVRIx+3VuxpFMBREYQkSDuduv/+r0k09q0CR6f9mybd1bW0Xr+Z5RbBE5AeBKY69Bghj+kAY/W9kMOK7QBj5j6AamVCNCIx+GwFUIwDVyIBqBKAamVDvyILaTGEsZ8ME47xZnGdln6OQB6DT5UIdSwOqigFVBcACToeqGFBVLKgqJlQVAMtw4m+uTmnt2trutx1vtyP8m6K/swAAAABJRU5ErkJggg=="

    :goto_0
    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    return-void
.end method

.method private r()V
    .locals 2

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->m:Landroid/widget/ImageButton;

    const-string v1, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4BAMAAABaqCYtAAAALVBMVEUAAAD///////////////////////////////////////////////////////+hSKubAAAADnRSTlMAiHmWyg99QwOvY/5hsQj4B2EAAADWSURBVDjLYxgFVACMCsg8JgEUSblHyDy9hyga371TQNL47h1YK4KLpFUPoRTBj5RgYGicysAGV4nQ+ozV7xUDw7onAXkIjQitIu8eMzDYvXMEa0TX+g4i+Q6hEaEVJonQiABsCMkEDMkQhKQruhyrH0LySQCaJCfIIcBQkwPRE7BY+W47A0M1iBZAk+Q4KCgoWMDAwA6kpBoYBh4gO0imgZBXCAcC4eDDDHjCUUY4sjGTCd4ERnzS1AM5IxaUqK9CEjXO7IDQipmRQFoF8GVB/Jl3FFAOAMFHuuusc6BSAAAAAElFTkSuQmCC"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->m:Landroid/widget/ImageButton;

    const-string v1, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAYAAACohjseAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoV2luZG93cykiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6NEUwNEE3ODVGODQyMTFFMzhCMTNBN0I3OUU0MDBEMDIiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6NEUwNEE3ODZGODQyMTFFMzhCMTNBN0I3OUU0MDBEMDIiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo0RTA0QTc4M0Y4NDIxMUUzOEIxM0E3Qjc5RTQwMEQwMiIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo0RTA0QTc4NEY4NDIxMUUzOEIxM0E3Qjc5RTQwMEQwMiIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PkG6ngcAAAJnSURBVHja7Jg7SwNBEMdzRhsLFUJa/QQWNiJopSn8CjEaEbGNyTXGZ6Px0eTy8Av4+gA2FhKwsvCBliIoKPgFrI2es7AHS7jN7e7tJiHMwJ+TdXbdnzM3s3uW67qRbraeSJcbAiIgAiIgAiIgAnax9SrMmabizX0FnYJ+JdeNgc5BM6A+js8LaAV0K7wqOYtKKAH6c4NtV3JdorIrZh8y68qm6CzIEvAbVciMe8Goj5h8B/sFfB5BiwqAF6AlhdTW/g4GwSVA34rzz+jzRDBTWl5Fr0LAeTamC84E4A4oH2J+EZTr5BQldkCfh5LzHFC23Y2+sQA8gPY5kHkNcMegdKjCI9mrlpl+dAcapONbnJ61LrCmw5lbBVnUZx5Up+M3MnuWBYyCCqBLBi4SApIHV2HgPM1R/7hJwCDxIDdCwilLdxXdA237jA/5jH35jFVBq+TN0bYjzRH0tMlE5KiJn834lXVGzpOJNkGsQJ8DoLWAvuedL7NaI0fNwi/bCIiAXQlIbgMlkC3gm6O+lpGdGGgRpHCVmPJvt7NNmIDz+7ZiB8AZg+wxkJYZn98NC45ltKer5H8kTs+QScHIuTRdLU60Zc6jyVYctmt0A+TqkmI2WuFs1AlIOVHIFHNdqpkErDMbID+nQ8CJQJI74ULD3/0xCShqjkKxcCTWbyugE6LqFTsd0NFQ2os6AXW2CXItedKwznM7L7xBVqdFQTV6jQWlI99BtoXIKCUIZzRFPwV8oqAJhWQap3N17EE5RSdBbwHRuwbFFCIYo3ObRfEdNCWzLn6yQEAEREAEREAEREAE7Fj7F2AA+Z+qB36kbeAAAAAASUVORK5CYII="

    :goto_0
    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 5

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->b:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->k()I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->requestFocus()Z

    :cond_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->a()V

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->b:Z

    :cond_1
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->q()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->p()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :cond_2
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/a;->d()Lcom/aggmoread/sdk/z/a/s/a$i;

    move-result-object v0

    sget-object v3, Lcom/aggmoread/sdk/z/a/s/a$i;->b:Lcom/aggmoread/sdk/z/a/s/a$i;

    const/16 v4, 0x8

    if-eq v0, v3, :cond_3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0, v2}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0, v4}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    :goto_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/a;->c()Lcom/aggmoread/sdk/z/a/s/a$i;

    move-result-object v0

    if-eq v0, v3, :cond_4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->r:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0, v2}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->r:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0, v4}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    :goto_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    if-eqz p1, :cond_5

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    int-to-long v2, p1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_5
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/s/a$g;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->q()V

    return-void
.end method

.method protected a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->e:Z

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->r()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->p()V

    return-void
.end method

.method protected c()Lcom/aggmoread/sdk/z/a/s/a$i;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method protected d()Lcom/aggmoread/sdk/z/a/s/a$i;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/16 v3, 0x4f

    const/16 v4, 0xbb8

    if-eq v0, v3, :cond_c

    const/16 v3, 0x55

    if-eq v0, v3, :cond_c

    const/16 v3, 0x3e

    if-ne v0, v3, :cond_1

    goto :goto_4

    :cond_1
    const/16 v3, 0x7e

    if-ne v0, v3, :cond_3

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/s/a$g;->a()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/s/a$g;->d()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->q()V

    invoke-virtual {p0, v4}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    :cond_2
    return v2

    :cond_3
    const/16 v3, 0x56

    if-eq v0, v3, :cond_a

    const/16 v3, 0x7f

    if-ne v0, v3, :cond_4

    goto :goto_3

    :cond_4
    const/16 v3, 0x19

    if-eq v0, v3, :cond_9

    const/16 v3, 0x18

    if-eq v0, v3, :cond_9

    const/16 v3, 0xa4

    if-eq v0, v3, :cond_9

    const/16 v3, 0x1b

    if-ne v0, v3, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x4

    if-eq v0, v3, :cond_7

    const/16 v3, 0x52

    if-ne v0, v3, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p0, v4}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_7
    :goto_1
    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    :cond_8
    return v2

    :cond_9
    :goto_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_a
    :goto_3
    if-eqz v1, :cond_b

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/s/a$g;->a()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->a:Lcom/aggmoread/sdk/z/a/s/a$g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/s/a$g;->b()V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->q()V

    invoke-virtual {p0, v4}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    :cond_b
    return v2

    :cond_c
    :goto_4
    if-eqz v1, :cond_d

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/s/a;->b()V

    invoke-virtual {p0, v4}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/widget/ImageButton;->requestFocus()Z

    :cond_d
    return v2
.end method

.method public e()V
    .locals 4

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->b:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/a;->c()Lcom/aggmoread/sdk/z/a/s/a$i;

    move-result-object v0

    sget-object v1, Lcom/aggmoread/sdk/z/a/s/a$i;->d:Lcom/aggmoread/sdk/z/a/s/a$i;

    const/16 v2, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->r:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0, v2}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    :cond_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/a;->d()Lcom/aggmoread/sdk/z/a/s/a$i;

    move-result-object v0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0, v2}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->b:Z

    :cond_2
    return-void
.end method

.method protected g(Landroid/widget/RelativeLayout;)Landroid/widget/ProgressBar;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->b:Z

    return v0
.end method

.method protected j()V
    .locals 6

    new-instance v0, Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    invoke-static {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v1

    const/4 v4, -0x1

    invoke-direct {v0, v1, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    const/4 v5, 0x4

    invoke-direct {p0, v1, v5}, Lcom/aggmoread/sdk/z/a/s/a;->a(Landroid/view/View;I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    const-string v5, "iVBORw0KGgoAAAANSUhEUgAAABcAAAAmCAMAAAAY0vCaAAAAVFBMVEUAAAD///////////////////////////////////////////////////////////////////////////////////////////////////////////8wXzyWAAAAG3RSTlMAD2P8Zsv2YPDGHOjghC4n13A2zExGPqufFQQwMkirAAAAeElEQVQoz7XM2Q5AMBCF4VFULbXv8/7vSSQiY6aEcC6/PznANg3a2JlxUuI6KzNmZ85wm5EZR8LFzo1HOL3mkHD+iGvzhHsHa5G7G44JtzLnvshgCXOvDqI/6hQUvg7Bj8H/LETvg3IEXThCBSxQp8EkwNaWOq5hAY/EHeIxvlzAAAAAAElFTkSuQmCC"

    invoke-static {v1, v5}, Lcom/aggmoread/sdk/z/a/m/j;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    const-string v5, "\u8fd4\u56de"

    invoke-virtual {v1, v5}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v5}, Landroid/widget/ImageButton;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    const-string v5, "#00000000"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/widget/ImageButton;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    invoke-virtual {v1, v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->k:Landroid/widget/TextView;

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x10

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->k:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->k:Landroid/widget/TextView;

    const/16 v2, 0x11

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->k:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    invoke-static {v2, v3, v4}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v2

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/s/a;->t:Landroid/content/Context;

    invoke-static {v5, v3, v4}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/content/Context;D)I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->k:Landroid/widget/TextView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->k:Landroid/widget/TextView;

    const-string v2, "#ffffff"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->k:Landroid/widget/TextView;

    const/16 v2, 0x12

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/widget/TextView;I)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->q:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/s/a;->k:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public l()V
    .locals 1

    const/16 v0, 0xbb8

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    return-void
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public o()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->w:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    if-eq p1, v0, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->x:Z

    if-nez p1, :cond_3

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->x:Z

    const/16 p1, 0xbb8

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/a/s/a;->x:Z

    :cond_3
    :goto_0
    return v0
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/16 p1, 0xbb8

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/a/s/a;->a(I)V

    const/4 p1, 0x0

    return p1
.end method

.method public setEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->l:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->h:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setEnabled(Z)V

    :cond_1
    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/s/a;->m:Landroid/widget/ImageButton;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a;->n:Landroid/widget/ImageButton;

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_3
    return-void
.end method
