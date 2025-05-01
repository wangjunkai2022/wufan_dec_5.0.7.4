.class public final Lcom/join/mgps/activity/DeveloperActivity_;
.super Lcom/join/mgps/activity/DeveloperActivity;
.source "DeveloperActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/DeveloperActivity_$u;
    }
.end annotation


# instance fields
.field private final i:La4/c;

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/DeveloperActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/DeveloperActivity_;->i:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/DeveloperActivity_;->j:Ljava/util/Map;

    return-void
.end method

.method public static E0(Landroid/content/Context;)Lcom/join/mgps/activity/DeveloperActivity_$u;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DeveloperActivity_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DeveloperActivity_$u;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static F0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/DeveloperActivity_$u;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DeveloperActivity_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DeveloperActivity_$u;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method


# virtual methods
.method public getBean(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DeveloperActivity_;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DeveloperActivity_;->i:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/DeveloperActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0034

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/DeveloperActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x7f0904f9

    .line 1
    invoke-interface {v1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, v0, Lcom/join/mgps/activity/DeveloperActivity;->b:Landroid/widget/EditText;

    const v2, 0x7f09074b

    .line 2
    invoke-interface {v1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09087b

    .line 3
    invoke-interface {v1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f090e8e

    .line 4
    invoke-interface {v1, v4}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f0901fa

    .line 5
    invoke-interface {v1, v5}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f090c0b

    .line 6
    invoke-interface {v1, v6}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f09025b

    .line 7
    invoke-interface {v1, v7}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f090248

    .line 8
    invoke-interface {v1, v8}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v8

    const v9, 0x7f090243

    .line 9
    invoke-interface {v1, v9}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v9

    const v10, 0x7f091322

    .line 10
    invoke-interface {v1, v10}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v10

    const v11, 0x7f09021a

    .line 11
    invoke-interface {v1, v11}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v11

    const v12, 0x7f09021b

    .line 12
    invoke-interface {v1, v12}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v12

    const v13, 0x7f090209

    .line 13
    invoke-interface {v1, v13}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v13

    const v14, 0x7f09020a

    .line 14
    invoke-interface {v1, v14}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v14

    const v15, 0x7f090223

    .line 15
    invoke-interface {v1, v15}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v15

    move-object/from16 v16, v15

    const v15, 0x7f090225

    .line 16
    invoke-interface {v1, v15}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v15

    move-object/from16 v17, v15

    const v15, 0x7f090254

    .line 17
    invoke-interface {v1, v15}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v15

    move-object/from16 v18, v15

    const v15, 0x7f090255

    .line 18
    invoke-interface {v1, v15}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v15

    move-object/from16 v19, v15

    const v15, 0x7f090224

    .line 19
    invoke-interface {v1, v15}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v15

    move-object/from16 v20, v15

    const v15, 0x7f090216

    .line 20
    invoke-interface {v1, v15}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v15

    move-object/from16 v21, v15

    const v15, 0x7f090201

    .line 21
    invoke-interface {v1, v15}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v2, :cond_0

    .line 22
    new-instance v15, Lcom/join/mgps/activity/DeveloperActivity_$k;

    invoke-direct {v15, v0}, Lcom/join/mgps/activity/DeveloperActivity_$k;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v2, v15}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v3, :cond_1

    .line 23
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$m;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$m;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v4, :cond_2

    .line 24
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$n;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$n;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v5, :cond_3

    .line 25
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$o;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$o;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v6, :cond_4

    .line 26
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$p;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$p;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v6, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v7, :cond_5

    .line 27
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$q;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$q;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v7, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    if-eqz v8, :cond_6

    .line 28
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$r;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$r;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v8, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    if-eqz v9, :cond_7

    .line 29
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$s;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$s;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v9, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    if-eqz v10, :cond_8

    .line 30
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$t;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$t;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v10, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    if-eqz v11, :cond_9

    .line 31
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$a;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$a;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v11, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    if-eqz v12, :cond_a

    .line 32
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$b;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$b;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v12, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    if-eqz v13, :cond_b

    .line 33
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$c;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$c;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v13, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    if-eqz v14, :cond_c

    .line 34
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$d;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$d;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v14, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_c
    if-eqz v16, :cond_d

    .line 35
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$e;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$e;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    move-object/from16 v3, v16

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_d
    if-eqz v17, :cond_e

    .line 36
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$f;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$f;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    move-object/from16 v3, v17

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_e
    if-eqz v18, :cond_f

    .line 37
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$g;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$g;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    move-object/from16 v3, v18

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_f
    if-eqz v19, :cond_10

    .line 38
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$h;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$h;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    move-object/from16 v3, v19

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_10
    if-eqz v20, :cond_11

    .line 39
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$i;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$i;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    move-object/from16 v3, v20

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_11
    if-eqz v21, :cond_12

    .line 40
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$j;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$j;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    move-object/from16 v3, v21

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_12
    if-eqz v1, :cond_13

    .line 41
    new-instance v2, Lcom/join/mgps/activity/DeveloperActivity_$l;

    invoke-direct {v2, v0}, Lcom/join/mgps/activity/DeveloperActivity_$l;-><init>(Lcom/join/mgps/activity/DeveloperActivity_;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/activity/DeveloperActivity;->afterViews()V

    return-void
.end method

.method public putBean(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DeveloperActivity_;->j:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/DeveloperActivity_;->i:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/DeveloperActivity_;->i:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/DeveloperActivity_;->i:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method
