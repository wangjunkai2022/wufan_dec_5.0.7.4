.class public final Lcom/join/mgps/activity/ForumPostsActivity_;
.super Lcom/join/mgps/activity/ForumPostsActivity;
.source "ForumPostsActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/ForumPostsActivity_$n1;
    }
.end annotation


# static fields
.field public static final G3:Ljava/lang/String; = "extBean"


# instance fields
.field private final C3:La4/c;

.field private final D3:Ljava/util/Map;
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

.field private final E3:Landroid/content/IntentFilter;

.field private final F3:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->C3:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->D3:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->E3:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$k;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->F3:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->B1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic B3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->C1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Q1()V

    return-void
.end method

.method static synthetic D3(Lcom/join/mgps/activity/ForumPostsActivity_;ZZI)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/ForumPostsActivity;->v1(ZZI)V

    return-void
.end method

.method static synthetic E3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->q2()V

    return-void
.end method

.method static synthetic F3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->touristLogin()V

    return-void
.end method

.method static synthetic G3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->J0(I)V

    return-void
.end method

.method static synthetic H3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->E0(I)V

    return-void
.end method

.method static synthetic I3(Lcom/join/mgps/activity/ForumPostsActivity_;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->f1(II)V

    return-void
.end method

.method static synthetic J3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->r2()V

    return-void
.end method

.method static synthetic K3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->K0(I)V

    return-void
.end method

.method static synthetic L3(Lcom/join/mgps/activity/ForumPostsActivity_;Landroid/widget/ListView;III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/activity/ForumPostsActivity;->R1(Landroid/widget/ListView;III)V

    return-void
.end method

.method static synthetic M3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->R0()V

    return-void
.end method

.method static synthetic N3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->S0()V

    return-void
.end method

.method static synthetic O3(Lcom/join/mgps/activity/ForumPostsActivity_;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->T0(II)V

    return-void
.end method

.method static synthetic P3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->L0()V

    return-void
.end method

.method static synthetic Q3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->Q0()V

    return-void
.end method

.method static synthetic R3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->X0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic S3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->L2(I)V

    return-void
.end method

.method static synthetic T3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->x0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic U3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->n2(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->v2()V

    return-void
.end method

.method static synthetic W3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/ForumPostsActivity;->P1(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method static synthetic X3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P0()V

    return-void
.end method

.method static synthetic Y2(Lcom/join/mgps/activity/ForumPostsActivity_;ZI)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->y1(ZI)V

    return-void
.end method

.method static synthetic Y3(Lcom/join/mgps/activity/ForumPostsActivity_;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->J2(II)V

    return-void
.end method

.method static synthetic Z2(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->g1()V

    return-void
.end method

.method static synthetic Z3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->M2(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic a3(Lcom/join/mgps/activity/ForumPostsActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->z1(Z)V

    return-void
.end method

.method static synthetic a4(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/customview/RewardType;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/ForumPostsActivity;->K2(Lcom/join/mgps/customview/RewardType;II)V

    return-void
.end method

.method static synthetic b3(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->x2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V

    return-void
.end method

.method public static b4(Landroid/content/Context;)Lcom/join/mgps/activity/ForumPostsActivity_$n1;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$n1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$n1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static synthetic c3(Lcom/join/mgps/activity/ForumPostsActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->D0(Z)V

    return-void
.end method

.method public static c4(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/ForumPostsActivity_$n1;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$n1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$n1;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method static synthetic d3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->U1(Ljava/util/List;I)V

    return-void
.end method

.method static synthetic e3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->x1()V

    return-void
.end method

.method static synthetic f3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->H2(I)V

    return-void
.end method

.method static synthetic g3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->e2(I)V

    return-void
.end method

.method static synthetic i3(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumCommentBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->X1(Lcom/join/mgps/dto/ForumBean$ForumCommentBean;)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    const v0, 0x7f10029a

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C1:Ljava/lang/String;

    const v0, 0x7f1000b6

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->D1:Ljava/lang/String;

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity_;->injectExtras_()V

    const/16 p1, 0xa

    .line 6
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->supportRequestWindowFeature(I)Z

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->E3:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->E3:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->F3:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->E3:Landroid/content/IntentFilter;

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "extBean"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ExtBean;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F1:Lcom/join/mgps/dto/ExtBean;

    :cond_0
    return-void
.end method

.method static synthetic j3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->S1(I)V

    return-void
.end method

.method static synthetic k3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->T1(I)V

    return-void
.end method

.method static synthetic l3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->H0()V

    return-void
.end method

.method static synthetic m3(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->V1(Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V

    return-void
.end method

.method static synthetic n3(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->W1(Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V

    return-void
.end method

.method static synthetic o3(Lcom/join/mgps/activity/ForumPostsActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->Y1(I)V

    return-void
.end method

.method static synthetic p3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->F2()V

    return-void
.end method

.method static synthetic q3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->l2()V

    return-void
.end method

.method static synthetic r3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->k2()V

    return-void
.end method

.method static synthetic s3(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->A2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    return-void
.end method

.method static synthetic t3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->j2()V

    return-void
.end method

.method static synthetic u3(Lcom/join/mgps/activity/ForumPostsActivity_;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity;->W2(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method static synthetic v3(Lcom/join/mgps/activity/ForumPostsActivity_;Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/activity/ForumPostsActivity;->V2(Landroidx/recyclerview/widget/RecyclerView;III)V

    return-void
.end method

.method static synthetic w3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->P2()V

    return-void
.end method

.method static synthetic x3(Lcom/join/mgps/activity/ForumPostsActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->B2()V

    return-void
.end method

.method static synthetic y3(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic z3(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity;->startDown(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method


# virtual methods
.method A2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$e0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$e0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$m0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$m0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$j0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$j0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$n0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$n0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public D0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$o;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$f;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$b0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$d;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H2(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$r;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ForumPostsActivity_$t0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ForumPostsActivity_$t0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method J2(II)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$i;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity_$i;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;II)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method K0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ForumPostsActivity_$w0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ForumPostsActivity_$w0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method K2(Lcom/join/mgps/customview/RewardType;II)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$l;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/activity/ForumPostsActivity_$l;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/customview/RewardType;II)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v0, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$b1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$b1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method L2(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$g;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method M2(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$j;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/CharSequence;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method P0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$h;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method P1(Ljava/lang/String;ILjava/lang/String;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/ForumPostsActivity_$i1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/ForumPostsActivity_$i1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method P2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$e;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$d1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$d1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Q1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$o0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$o0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method R0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$y0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$y0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method R1(Landroid/widget/ListView;III)V
    .locals 11

    .line 1
    new-instance v10, Lcom/join/mgps/activity/ForumPostsActivity_$x0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v10

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    move v9, p4

    invoke-direct/range {v0 .. v9}, Lcom/join/mgps/activity/ForumPostsActivity_$x0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;Landroid/widget/ListView;III)V

    invoke-static {v10}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method S0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$z0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$z0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method S1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$w;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$w;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method T0(II)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/ForumPostsActivity_$a1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/ForumPostsActivity_$a1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;II)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method T1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$x;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$x;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method U1(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumCommentBean;",
            ">;I)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$p;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity_$p;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/util/List;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method V1(Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$y;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$y;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method V2(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$i0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$i0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Landroidx/recyclerview/widget/RecyclerView;III)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v6, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method W1(Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$z;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$z;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method W2(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$h0;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity_$h0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Landroidx/recyclerview/widget/RecyclerView;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ForumPostsActivity_$e1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ForumPostsActivity_$e1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method X1(Lcom/join/mgps/dto/ForumBean$ForumCommentBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$u;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$u;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumCommentBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$a0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$a0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e2(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$t;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$t;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method error(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$s;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f1(II)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/ForumPostsActivity_$u0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/ForumPostsActivity_$u0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;II)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$m;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

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
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->D3:Ljava/util/Map;

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
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method j2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$f0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$f0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$d0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$d0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$c0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$c0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method n2(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ForumPostsActivity_$g1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ForumPostsActivity_$g1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->C3:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c05bc

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->F3:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->onDestroy()V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090089

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f090146

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c:Landroid/widget/ImageView;

    const v0, 0x7f090c48

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f0905fa

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f090d57

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomLoadingView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->f:Lcom/join/mgps/customview/CustomLoadingView;

    const v0, 0x7f091028

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->g:Landroid/widget/LinearLayout;

    const v0, 0x7f091026

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f091027

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f090c31

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->j:Landroid/widget/LinearLayout;

    const v0, 0x7f0904ca

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/common/view/ClearEditText;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->k:Lcom/join/android/app/common/view/ClearEditText;

    const v0, 0x7f09023a

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l:Landroid/widget/Button;

    const v0, 0x7f09023c

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m:Landroid/widget/Button;

    const v0, 0x7f09023b

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n:Landroid/widget/Button;

    const v0, 0x7f0904c8

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f091166

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p:Landroid/widget/RelativeLayout;

    const v0, 0x7f090800

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->q:Landroid/widget/ImageView;

    const v0, 0x7f0905ce

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f090239

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s:Landroid/widget/Button;

    const v0, 0x7f0902d4

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->t:Landroid/widget/LinearLayout;

    const v0, 0x7f0902d2

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->u:Landroid/view/View;

    const v0, 0x7f0902d3

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->v:Landroid/widget/LinearLayout;

    const v0, 0x7f090dd3

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lit/sephiroth/android/library/widget/HListView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->w:Lit/sephiroth/android/library/widget/HListView;

    const v0, 0x7f09120a

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->x:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0917cf

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/VipView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->y:Lcom/join/mgps/customview/VipView;

    const v0, 0x7f0903b1

    .line 25
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->z:Landroid/widget/TextView;

    const v0, 0x7f090e39

    .line 26
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->A:Landroid/widget/TextView;

    const v0, 0x7f090df5

    .line 27
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->B:Landroid/widget/TextView;

    const v0, 0x7f0905f5

    .line 28
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->C:Landroid/widget/Button;

    const v0, 0x7f090f4a

    .line 29
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->D:Landroid/widget/ImageView;

    const v0, 0x7f0905f9

    .line 30
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->E:Landroid/widget/ImageView;

    const v0, 0x7f090600

    .line 31
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->F:Landroid/widget/TextView;

    const v0, 0x7f0911d2

    .line 32
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->G:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const v0, 0x7f0903ca

    .line 33
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->H:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    const v0, 0x7f090623

    .line 34
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ForumStickView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->I:Lcom/join/mgps/customview/ForumStickView;

    const v0, 0x7f090950

    .line 35
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->J:Landroid/widget/ImageView;

    const v0, 0x7f0911d3

    .line 36
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->K:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0917b8

    .line 37
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->L:Landroid/view/View;

    const v0, 0x7f091791

    .line 38
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->P2:Landroid/widget/FrameLayout;

    const v0, 0x7f091793

    .line 39
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->Q2:Landroid/widget/RelativeLayout;

    const v0, 0x7f09178e

    .line 40
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/MyVideoView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->R2:Lcom/join/android/app/component/video/MyVideoView;

    const v0, 0x7f0903c2

    .line 41
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->S2:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09100b

    .line 42
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity;->T2:Landroid/widget/ImageView;

    const v0, 0x7f090d54

    .line 43
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->U2:Landroid/widget/LinearLayout;

    .line 44
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->p:Landroid/widget/RelativeLayout;

    if-eqz p1, :cond_0

    .line 45
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$v;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->l:Landroid/widget/Button;

    if-eqz p1, :cond_1

    .line 47
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$g0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$g0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->m:Landroid/widget/Button;

    if-eqz p1, :cond_2

    .line 49
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$r0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$r0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->c:Landroid/widget/ImageView;

    if-eqz p1, :cond_3

    .line 51
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$c1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$c1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->n:Landroid/widget/Button;

    if-eqz p1, :cond_4

    .line 53
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$j1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$j1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->s:Landroid/widget/Button;

    if-eqz p1, :cond_5

    .line 55
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$k1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$k1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->q:Landroid/widget/ImageView;

    if-eqz p1, :cond_6

    .line 57
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$l1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$l1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->i:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_7

    .line 59
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$m1;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$m1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity;->J:Landroid/widget/ImageView;

    if-eqz p1, :cond_8

    .line 61
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$a;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    :cond_8
    invoke-virtual {p0}, Lcom/join/mgps/activity/ForumPostsActivity;->afterViews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->D3:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q2()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$q0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$q0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method r2()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$v0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$v0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->C3:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->C3:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ForumPostsActivity_;->C3:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ForumPostsActivity_;->injectExtras_()V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$k0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$k0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method startDown(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$l0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$l0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/DetailResultBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method touristLogin()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$s0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$s0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method v1(ZZI)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/ForumPostsActivity_$p0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/ForumPostsActivity_$p0;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;ZZI)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method v2()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ForumPostsActivity_$h1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ForumPostsActivity_$h1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method x0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ForumPostsActivity_$f1;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ForumPostsActivity_$f1;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method x1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ForumPostsActivity_$q;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x2(Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$n;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity_$n;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y1(ZI)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ForumPostsActivity_$b;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;ZI)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z1(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ForumPostsActivity_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ForumPostsActivity_$c;-><init>(Lcom/join/mgps/activity/ForumPostsActivity_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
