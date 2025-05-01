.class public Lcom/join/mgps/dialog/j;
.super Ljava/lang/Object;
.source "ArenaGameListSortDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private b:Landroid/app/Dialog;

.field c:Landroid/app/Activity;

.field d:I

.field e:I

.field f:Landroid/widget/RadioGroup;

.field g:Landroid/widget/RadioGroup;

.field private h:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

.field i:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lapp/mgsim/arena/AreaInfo;",
            ">;"
        }
    .end annotation
.end field

.field j:Lapp/mgsim/arena/AreaInfo;

.field k:I

.field l:Landroid/widget/ImageView;

.field m:Landroid/widget/ImageView;

.field n:Landroid/widget/ImageView;

.field o:Landroid/view/View;

.field p:Landroid/view/View;

.field q:Landroid/view/View;

.field r:Landroid/view/View;

.field s:Landroid/view/View;

.field t:Landroid/view/View;

.field u:Lcom/join/mgps/customview/y$e;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;Lcom/join/mgps/customview/y$e;Ljava/util/concurrent/ConcurrentHashMap;Lapp/mgsim/arena/AreaInfo;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;",
            "Lcom/join/mgps/customview/y$e;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lapp/mgsim/arena/AreaInfo;",
            ">;",
            "Lapp/mgsim/arena/AreaInfo;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/dialog/j;->d:I

    const/4 v0, 0x3

    .line 3
    iput v0, p0, Lcom/join/mgps/dialog/j;->e:I

    .line 4
    iput-object p1, p0, Lcom/join/mgps/dialog/j;->c:Landroid/app/Activity;

    .line 5
    iput-object p3, p0, Lcom/join/mgps/dialog/j;->u:Lcom/join/mgps/customview/y$e;

    .line 6
    iput-object p2, p0, Lcom/join/mgps/dialog/j;->h:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

    .line 7
    invoke-virtual {p0, p1}, Lcom/join/mgps/dialog/j;->b(Landroid/app/Activity;)V

    .line 8
    iput p6, p0, Lcom/join/mgps/dialog/j;->k:I

    .line 9
    invoke-virtual {p0, p4, p5}, Lcom/join/mgps/dialog/j;->c(Ljava/util/concurrent/ConcurrentHashMap;Lapp/mgsim/arena/AreaInfo;)V

    .line 10
    iput-object p4, p0, Lcom/join/mgps/dialog/j;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    iput-object p5, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    return-void
.end method

.method private e(Landroid/view/View;ZLandroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const p2, 0x7f0801c3

    goto :goto_0

    :cond_0
    const p2, 0x7f0801c1

    .line 1
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    if-eqz p4, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const/16 p1, 0x8

    .line 2
    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method b(Landroid/app/Activity;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/app/Dialog;

    const v1, 0x7f110512

    invoke-direct {v0, p1, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/join/mgps/dialog/j;->b:Landroid/app/Dialog;

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 5
    iget-object v1, p0, Lcom/join/mgps/dialog/j;->b:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 6
    :cond_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c01e4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f09091d

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f09156a

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f09112e

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/join/mgps/dialog/j;->f:Landroid/widget/RadioGroup;

    const v0, 0x7f09112d

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/join/mgps/dialog/j;->g:Landroid/widget/RadioGroup;

    const v0, 0x7f0917b7

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dialog/j;->o:Landroid/view/View;

    const v0, 0x7f0917be

    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dialog/j;->p:Landroid/view/View;

    const v0, 0x7f0917b9

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dialog/j;->q:Landroid/view/View;

    const v0, 0x7f091189

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/dialog/j;->s:Landroid/view/View;

    const v1, 0x7f091164

    .line 15
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/dialog/j;->r:Landroid/view/View;

    const v2, 0x7f091170

    .line 16
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/join/mgps/dialog/j;->t:Landroid/view/View;

    const v3, 0x7f090930

    .line 17
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, p0, Lcom/join/mgps/dialog/j;->n:Landroid/widget/ImageView;

    const v3, 0x7f090967

    .line 18
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, p0, Lcom/join/mgps/dialog/j;->m:Landroid/widget/ImageView;

    const v3, 0x7f090914

    .line 19
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, p0, Lcom/join/mgps/dialog/j;->l:Landroid/widget/ImageView;

    .line 20
    invoke-static {p1, v1}, Lcom/join/mgps/Util/t2;->b(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    invoke-static {p1, v0}, Lcom/join/mgps/Util/t2;->b(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    invoke-static {p1, v2}, Lcom/join/mgps/Util/t2;->b(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->f:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/join/mgps/dialog/j$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/dialog/j$a;-><init>(Lcom/join/mgps/dialog/j;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->g:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/join/mgps/dialog/j$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/dialog/j$b;-><init>(Lcom/join/mgps/dialog/j;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->b:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 26
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/4 v1, -0x1

    .line 28
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 29
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v0, 0x11

    .line 30
    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    return-void
.end method

.method public c(Ljava/util/concurrent/ConcurrentHashMap;Lapp/mgsim/arena/AreaInfo;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lapp/mgsim/arena/AreaInfo;",
            ">;",
            "Lapp/mgsim/arena/AreaInfo;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->elements()Ljava/util/Enumeration;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->r:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->s:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->t:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 6
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lapp/mgsim/arena/AreaInfo;

    .line 7
    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v2

    invoke-virtual {p2}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v3

    if-ne v2, v3, :cond_1

    .line 8
    new-instance v2, Lapp/mgsim/arena/AreaInfo;

    invoke-direct {v2}, Lapp/mgsim/arena/AreaInfo;-><init>()V

    iput-object v2, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    .line 9
    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v3

    invoke-virtual {v2, v3}, Lapp/mgsim/arena/AreaInfo;->setArea(I)V

    .line 10
    iget-object v2, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lapp/mgsim/arena/AreaInfo;->setHost(Ljava/lang/String;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getOnLinePeopleCounts()I

    move-result v3

    invoke-virtual {v2, v3}, Lapp/mgsim/arena/AreaInfo;->setOnLinePeopleCounts(I)V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getPingTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lapp/mgsim/arena/AreaInfo;->setPingTime(J)V

    .line 13
    iget-object v2, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getPort()I

    move-result v3

    invoke-virtual {v2, v3}, Lapp/mgsim/arena/AreaInfo;->setPort(I)V

    .line 14
    :cond_1
    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    .line 15
    iget-object v2, p0, Lcom/join/mgps/dialog/j;->o:Landroid/view/View;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getPingTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/join/mgps/socket/fight/arena/c;->m(J)Z

    move-result v4

    iget-object v5, p0, Lcom/join/mgps/dialog/j;->l:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v6

    iget v7, p0, Lcom/join/mgps/dialog/j;->k:I

    if-ne v6, v7, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-direct {p0, v2, v4, v5, v6}, Lcom/join/mgps/dialog/j;->e(Landroid/view/View;ZLandroid/view/View;Z)V

    .line 16
    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v0

    invoke-virtual {p2}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v2

    if-ne v0, v2, :cond_0

    .line 17
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->r:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    .line 18
    :cond_3
    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_5

    .line 19
    iget-object v2, p0, Lcom/join/mgps/dialog/j;->p:Landroid/view/View;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getPingTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/join/mgps/socket/fight/arena/c;->m(J)Z

    move-result v4

    iget-object v5, p0, Lcom/join/mgps/dialog/j;->m:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v6

    iget v7, p0, Lcom/join/mgps/dialog/j;->k:I

    if-ne v6, v7, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    invoke-direct {p0, v2, v4, v5, v6}, Lcom/join/mgps/dialog/j;->e(Landroid/view/View;ZLandroid/view/View;Z)V

    .line 20
    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v0

    invoke-virtual {p2}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v2

    if-ne v0, v2, :cond_0

    .line 21
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->s:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    goto/16 :goto_0

    .line 22
    :cond_5
    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v2

    const/4 v4, 0x3

    if-ne v2, v4, :cond_0

    .line 23
    iget-object v2, p0, Lcom/join/mgps/dialog/j;->q:Landroid/view/View;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getPingTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/join/mgps/socket/fight/arena/c;->m(J)Z

    move-result v4

    iget-object v5, p0, Lcom/join/mgps/dialog/j;->n:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v6

    iget v7, p0, Lcom/join/mgps/dialog/j;->k:I

    if-ne v6, v7, :cond_6

    const/4 v6, 0x1

    goto :goto_3

    :cond_6
    const/4 v6, 0x0

    :goto_3
    invoke-direct {p0, v2, v4, v5, v6}, Lcom/join/mgps/dialog/j;->e(Landroid/view/View;ZLandroid/view/View;Z)V

    .line 24
    invoke-virtual {v0}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v0

    invoke-virtual {p2}, Lapp/mgsim/arena/AreaInfo;->getArea()I

    move-result v2

    if-ne v0, v2, :cond_0

    .line 25
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->t:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method public d(ILjava/util/List;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameConfig;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/join/mgps/dialog/j;->d:I

    .line 2
    iget-object p2, p0, Lcom/join/mgps/dialog/j;->f:Landroid/widget/RadioGroup;

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    const p1, 0x7f0910b9

    goto :goto_0

    :cond_0
    const p1, 0x7f0910be

    :goto_0
    invoke-virtual {p2, p1}, Landroid/widget/RadioGroup;->check(I)V

    .line 3
    iput p4, p0, Lcom/join/mgps/dialog/j;->e:I

    const/4 p1, 0x3

    const p2, 0x7f0910bb

    if-eq p4, p1, :cond_4

    const/4 p1, 0x4

    if-eq p4, p1, :cond_3

    const/4 p1, 0x5

    if-eq p4, p1, :cond_2

    const/4 p1, 0x6

    if-eq p4, p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->g:Landroid/widget/RadioGroup;

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_1

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->g:Landroid/widget/RadioGroup;

    const p2, 0x7f0910bd

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_1

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->g:Landroid/widget/RadioGroup;

    const p2, 0x7f0910bf

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_1

    .line 7
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->g:Landroid/widget/RadioGroup;

    const p2, 0x7f0910ba

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_1

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->g:Landroid/widget/RadioGroup;

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->check(I)V

    :goto_1
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/dialog/j;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f09091d

    if-eq p1, v0, :cond_5

    const v0, 0x7f09156a

    if-eq p1, v0, :cond_3

    const v0, 0x7f091164

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->u:Lcom/join/mgps/customview/y$e;

    sget-object v0, Lcom/papa91/battle/protocol/BattleArea;->BJ:Lcom/papa91/battle/protocol/BattleArea;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/y$e;->a(Lcom/papa91/battle/protocol/BattleArea;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lapp/mgsim/arena/AreaInfo;->setArea(I)V

    goto :goto_0

    :cond_0
    const v0, 0x7f091189

    if-ne p1, v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->u:Lcom/join/mgps/customview/y$e;

    sget-object v0, Lcom/papa91/battle/protocol/BattleArea;->SH:Lcom/papa91/battle/protocol/BattleArea;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/y$e;->a(Lcom/papa91/battle/protocol/BattleArea;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lapp/mgsim/arena/AreaInfo;->setArea(I)V

    goto :goto_0

    :cond_1
    const v0, 0x7f091170

    if-ne p1, v0, :cond_2

    .line 6
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->u:Lcom/join/mgps/customview/y$e;

    sget-object v0, Lcom/papa91/battle/protocol/BattleArea;->GZ:Lcom/papa91/battle/protocol/BattleArea;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/y$e;->a(Lcom/papa91/battle/protocol/BattleArea;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lapp/mgsim/arena/AreaInfo;->setArea(I)V

    .line 8
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->i:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v0, p0, Lcom/join/mgps/dialog/j;->j:Lapp/mgsim/arena/AreaInfo;

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/dialog/j;->c(Ljava/util/concurrent/ConcurrentHashMap;Lapp/mgsim/arena/AreaInfo;)V

    goto :goto_1

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->h:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

    if-eqz p1, :cond_4

    .line 10
    iget v0, p0, Lcom/join/mgps/dialog/j;->e:I

    iget v1, p0, Lcom/join/mgps/dialog/j;->d:I

    invoke-interface {p1, v0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;->b(II)V

    .line 11
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/dialog/j;->a()V

    goto :goto_1

    .line 12
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/dialog/j;->h:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;

    if-eqz p1, :cond_6

    .line 13
    iget v0, p0, Lcom/join/mgps/dialog/j;->e:I

    iget v1, p0, Lcom/join/mgps/dialog/j;->d:I

    invoke-interface {p1, v0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$m;->b(II)V

    .line 14
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/dialog/j;->a()V

    :goto_1
    return-void
.end method
