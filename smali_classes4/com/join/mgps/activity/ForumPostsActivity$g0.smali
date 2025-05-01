.class Lcom/join/mgps/activity/ForumPostsActivity$g0;
.super Landroid/widget/PopupWindow;
.source "ForumPostsActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/ForumPostsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g0"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/LinearLayout;

.field final synthetic d:Lcom/join/mgps/activity/ForumPostsActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->d:Lcom/join/mgps/activity/ForumPostsActivity;

    .line 2
    invoke-direct {p0, p2}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 3
    iput-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->a:Landroid/content/Context;

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity$g0;->a()V

    return-void
.end method

.method public constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity;Landroid/content/Context;II)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->d:Lcom/join/mgps/activity/ForumPostsActivity;

    .line 6
    invoke-direct {p0, p3, p4}, Landroid/widget/PopupWindow;-><init>(II)V

    .line 7
    iput-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->a:Landroid/content/Context;

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity$g0;->a()V

    return-void
.end method

.method private b()V
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
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity$g0$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity$g0$c;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$g0;)V

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c06f1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    const/4 v1, -0x2

    .line 3
    invoke-virtual {p0, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 4
    invoke-virtual {p0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    const v1, 0x7f090cea

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->b:Landroid/widget/LinearLayout;

    const v1, 0x7f090d12

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->c:Landroid/widget/LinearLayout;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$g0$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$g0$a;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$g0;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$g0;->c:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/join/mgps/activity/ForumPostsActivity$g0$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$g0$b;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$g0;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity$g0;->b()V

    return-void
.end method
