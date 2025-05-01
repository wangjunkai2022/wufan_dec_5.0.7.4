.class Lcom/join/mgps/activity/ForumPostsActivity$b0;
.super Landroid/widget/BaseAdapter;
.source "ForumPostsActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/ForumPostsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b0"
.end annotation


# instance fields
.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/ForumPostsActivity$c0;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/join/mgps/activity/ForumPostsActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/ForumPostsActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->c:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/activity/ForumPostsActivity$c0;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/activity/ForumPostsActivity$c0;",
            ")",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/ForumPostsActivity$c0;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    return-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    return-object p1
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/ForumPostsActivity$c0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    return-object v0
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/ForumPostsActivity$c0;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/BaseAdapter;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;

    goto :goto_0

    .line 2
    :cond_0
    new-instance p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;

    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->c:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-direct {p3, p2}, Lcom/join/mgps/activity/ForumPostsActivity$d0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity;)V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/ForumPostsActivity$b0;->c:Lcom/join/mgps/activity/ForumPostsActivity;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0248

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    const v0, 0x7f09078d

    .line 4
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    const v0, 0x7f090ea1

    .line 5
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const v0, 0x7f091770

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->c:Landroid/view/View;

    .line 7
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0;->getCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/16 v2, 0x8

    if-ne p1, v0, :cond_1

    .line 9
    iget-object v0, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->c:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 10
    :cond_1
    iget-object v0, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->c:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :goto_1
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity$b0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/ForumPostsActivity$c0;

    .line 12
    iget v0, p1, Lcom/join/mgps/activity/ForumPostsActivity$c0;->a:I

    if-ne v0, v1, :cond_3

    .line 13
    iget-object v0, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    iget-boolean p1, p1, Lcom/join/mgps/activity/ForumPostsActivity$c0;->c:Z

    if-eqz p1, :cond_2

    const p1, 0x7f080a3b

    goto :goto_2

    :cond_2
    const p1, 0x7f080a3a

    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 14
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u6536\u85cf"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$b;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$b;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    :cond_3
    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 16
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    const v0, 0x7f080674

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 17
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u5206\u4eab"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$c;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$c;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    :cond_4
    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 19
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    const v0, 0x7f080a35

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 20
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u5012\u5e8f\u67e5\u770b"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$d;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$d;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    :cond_5
    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    .line 22
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    const v0, 0x7f080a36

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 23
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u6b63\u5e8f\u67e5\u770b"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$e;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$e;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    :cond_6
    const/4 v1, 0x5

    if-ne v0, v1, :cond_7

    .line 25
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    const v0, 0x7f080673

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 26
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u4e3e\u62a5"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$f;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$f;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    :cond_7
    const/4 v1, 0x6

    const v3, 0x7f080672

    if-ne v0, v1, :cond_8

    .line 28
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 29
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u5220\u5e16"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$g;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$g;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    :cond_8
    const/4 v1, 0x7

    if-ne v0, v1, :cond_a

    .line 31
    iget-object v0, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    iget-boolean p1, p1, Lcom/join/mgps/activity/ForumPostsActivity$c0;->d:Z

    if-eqz p1, :cond_9

    const p1, 0x7f080a38

    goto :goto_3

    :cond_9
    const p1, 0x7f080a37

    :goto_3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 32
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u52a0\u7cbe"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$h;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$h;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    :cond_a
    if-ne v0, v2, :cond_b

    .line 34
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    const v0, 0x7f080a40

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 35
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u6536\u5f55\u81f3\u8bdd\u9898"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$i;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$i;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    :cond_b
    const/16 v1, 0x9

    if-ne v0, v1, :cond_c

    .line 37
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 38
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u79fb\u9664\u8bdd\u9898"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$j;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$j;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    :cond_c
    const/16 v1, 0xa

    if-ne v0, v1, :cond_e

    .line 40
    iget-object v0, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->a:Landroid/widget/ImageView;

    iget-boolean p1, p1, Lcom/join/mgps/activity/ForumPostsActivity$c0;->e:Z

    if-eqz p1, :cond_d

    const p1, 0x7f080a3d

    goto :goto_4

    :cond_d
    const p1, 0x7f080a3c

    :goto_4
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 41
    iget-object p1, p3, Lcom/join/mgps/activity/ForumPostsActivity$d0;->b:Landroid/widget/TextView;

    const-string p3, "\u7f6e\u9876"

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    new-instance p1, Lcom/join/mgps/activity/ForumPostsActivity$b0$a;

    invoke-direct {p1, p0}, Lcom/join/mgps/activity/ForumPostsActivity$b0$a;-><init>(Lcom/join/mgps/activity/ForumPostsActivity$b0;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_e
    :goto_5
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/BaseAdapter;->getViewTypeCount()I

    move-result v0

    return v0
.end method
