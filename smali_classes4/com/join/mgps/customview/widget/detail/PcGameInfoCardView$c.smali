.class Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;
.super Landroid/widget/PopupWindow;
.source "PcGameInfoCardView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/TextView;

.field final synthetic c:Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;


# direct methods
.method public constructor <init>(Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->c:Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;

    .line 2
    invoke-direct {p0, p2}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 3
    iput-object p2, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->a:Landroid/content/Context;

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->a()V

    return-void
.end method

.method public constructor <init>(Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;Landroid/content/Context;II)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->c:Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView;

    .line 6
    invoke-direct {p0, p3, p4}, Landroid/widget/PopupWindow;-><init>(II)V

    .line 7
    iput-object p2, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->a:Landroid/content/Context;

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->a()V

    return-void
.end method

.method private c()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 5
    new-instance v0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c$a;-><init>(Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;)V

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c06ee

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    const v1, 0x7f091696

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->b:Landroid/widget/TextView;

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->c()V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/PcGameInfoCardView$c;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
