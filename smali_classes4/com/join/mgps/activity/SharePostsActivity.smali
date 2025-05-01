.class public Lcom/join/mgps/activity/SharePostsActivity;
.super Lcom/BaseActivity;
.source "SharePostsActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/SharePostsActivity$h;,
        Lcom/join/mgps/activity/SharePostsActivity$i;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0748
.end annotation


# static fields
.field public static final A:Ljava/lang/String; = "forum_id"

.field public static final B:Ljava/lang/String; = "key_from_posts_submit_request"

.field public static final C:Ljava/lang/String; = "key_from_class"

.field private static D:Ljava/lang/String; = "value_from_class"

.field public static final E:I = 0x9


# instance fields
.field public final b:Ljava/lang/String;

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Lit/sephiroth/android/library/widget/HListView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Lcom/join/mgps/activity/SharePostsActivity$i;

.field j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field k:Lcom/join/mgps/rpc/i;

.field l:I

.field m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

.field private n:Lcom/join/mgps/dialog/w0;

.field o:I

.field p:Lcom/join/mgps/dialog/v0;

.field q:I

.field private r:Lcom/join/mgps/Util/j0$j;

.field private s:Lnet/bither/util/b$e;

.field private t:[Ljava/lang/String;

.field u:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v:Landroid/widget/GridView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field w:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private x:Landroid/widget/SimpleAdapter;

.field private y:I

.field z:Lcom/join/mgps/customview/o;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->b:Ljava/lang/String;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->l:I

    .line 4
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    double-to-int v1, v1

    iput v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->o:I

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->q:I

    .line 6
    new-instance v1, Lcom/join/mgps/activity/SharePostsActivity$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SharePostsActivity$a;-><init>(Lcom/join/mgps/activity/SharePostsActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->r:Lcom/join/mgps/Util/j0$j;

    .line 7
    new-instance v1, Lcom/join/mgps/activity/SharePostsActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SharePostsActivity$b;-><init>(Lcom/join/mgps/activity/SharePostsActivity;)V

    iput-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->s:Lnet/bither/util/b$e;

    const-string v2, "0"

    const-string v3, "5"

    const-string v4, "10"

    const-string v5, "30"

    const-string v6, "50"

    const-string v7, "60"

    const-string v8, "80"

    const-string v9, "100"

    .line 8
    filled-new-array/range {v2 .. v9}, [Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->t:[Ljava/lang/String;

    .line 9
    iput v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->y:I

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->z:Lcom/join/mgps/customview/o;

    return-void
.end method

.method private A0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/v0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/v0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    const/16 v1, 0x8

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->b(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    const-string v1, "\u653e\u5f03\u53d1\u5e03"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->f(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    const-string v1, "\u7ee7\u7eed\u7f16\u8f91"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->d(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    const-string v1, "\u4f60\u8981\u653e\u5f03\u53d1\u5e03\u5417\uff1f"

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->g(Ljava/lang/String;)Lcom/join/mgps/dialog/v0;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/SharePostsActivity$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SharePostsActivity$f;-><init>(Lcom/join/mgps/activity/SharePostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->c(Landroid/view/View$OnClickListener;)Lcom/join/mgps/dialog/v0;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/SharePostsActivity$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SharePostsActivity$e;-><init>(Lcom/join/mgps/activity/SharePostsActivity;)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/v0;->e(Landroid/view/View$OnClickListener;)Lcom/join/mgps/dialog/v0;

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    return-void
.end method

.method private accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    return-object p1
.end method

.method static synthetic g0(Lcom/join/mgps/activity/SharePostsActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/SharePostsActivity;->y:I

    return p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/SharePostsActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/SharePostsActivity;->y:I

    return p1
.end method

.method static synthetic i0(Lcom/join/mgps/activity/SharePostsActivity;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/SharePostsActivity;->t:[Ljava/lang/String;

    return-object p0
.end method

.method static synthetic j0(Lcom/join/mgps/activity/SharePostsActivity;)Landroid/widget/SimpleAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/SharePostsActivity;->x:Landroid/widget/SimpleAdapter;

    return-object p0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/SharePostsActivity;Landroid/widget/SimpleAdapter;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/SharePostsActivity;->l0(Landroid/widget/SimpleAdapter;IZ)V

    return-void
.end method

.method private l0(Landroid/widget/SimpleAdapter;IZ)V
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Landroid/widget/SimpleAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    const-string v1, "itemRadioImg"

    if-eqz p3, :cond_0

    const p3, 0x7f080d94

    .line 2
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const p3, 0x7f080d93

    .line 3
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :goto_0
    invoke-virtual {p1}, Landroid/widget/SimpleAdapter;->notifyDataSetChanged()V

    .line 5
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/SharePostsActivity;->y0(I)V

    return-void
.end method

.method private m0()V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private n0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->getImages()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 4
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 6
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Lnet/bither/util/b;->k(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iput-object v1, v0, Lnet/bither/util/b;->c:Ljava/util/Hashtable;

    .line 9
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iput-object v1, v0, Lnet/bither/util/b;->b:Ljava/util/Hashtable;

    :cond_3
    :goto_2
    return-void
.end method

.method private o0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->z:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->z:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private q0(Landroid/content/Intent;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "key_selected_images"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 3
    :cond_1
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method private r0(I[Ljava/lang/String;)Landroid/widget/SimpleAdapter;
    .locals 6

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p2

    const-string v3, "itemRadioText"

    const-string v4, "itemRadioImg"

    if-ge v0, v1, :cond_0

    .line 3
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    aget-object v4, p2, v0

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Landroid/widget/SimpleAdapter;

    const p2, 0x7f0c05ef

    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x2

    new-array v5, v0, [I

    fill-array-data v5, :array_0

    move-object v0, p1

    move-object v1, p0

    move v3, p2

    invoke-direct/range {v0 .. v5}, Landroid/widget/SimpleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;I[Ljava/lang/String;[I)V

    return-object p1

    :array_0
    .array-data 4
        0x7f0908b6
        0x7f0908b7
    .end array-data
.end method

.method private s0()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    .line 2
    new-instance v0, Lcom/join/mgps/activity/SharePostsActivity$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SharePostsActivity$i;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->i:Lcom/join/mgps/activity/SharePostsActivity$i;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/SharePostsActivity$i;->d(Ljava/util/List;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->i:Lcom/join/mgps/activity/SharePostsActivity$i;

    new-instance v1, Lcom/join/mgps/activity/SharePostsActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SharePostsActivity$d;-><init>(Lcom/join/mgps/activity/SharePostsActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/SharePostsActivity$i;->g(Lcom/join/mgps/activity/SharePostsActivity$i$d;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->g:Lit/sephiroth/android/library/widget/HListView;

    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->i:Lcom/join/mgps/activity/SharePostsActivity$i;

    invoke-virtual {v0, v1}, Lit/sephiroth/android/library/widget/HListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method private u0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->c:Landroid/widget/TextView;

    const-string v1, "\u53d1\u5e16"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->d:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 3
    new-instance v0, Lcom/join/mgps/dialog/w0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/w0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->n:Lcom/join/mgps/dialog/w0;

    const/4 v2, 0x1

    .line 4
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->n:Lcom/join/mgps/dialog/w0;

    new-instance v3, Lcom/join/mgps/activity/SharePostsActivity$c;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/SharePostsActivity$c;-><init>(Lcom/join/mgps/activity/SharePostsActivity;)V

    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v0

    iget-object v3, p0, Lcom/join/mgps/activity/SharePostsActivity;->r:Lcom/join/mgps/Util/j0$j;

    invoke-virtual {v0, v3}, Lcom/join/mgps/Util/j0;->b(Lcom/join/mgps/Util/j0$j;)V

    .line 7
    new-instance v0, Landroid/text/SpannableString;

    const-string v3, "\u6bcf\u6b21\u6700\u591a\u53ef\u4ee5\u5206\u4eab9\u5f20\u56fe"

    invoke-direct {v0, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 8
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    const-string v4, "#808080"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v4, 0x8

    const/16 v5, 0x9

    const/16 v6, 0x21

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 9
    iget-object v3, p0, Lcom/join/mgps/activity/SharePostsActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-array v0, v2, [Landroid/text/InputFilter;

    .line 10
    new-instance v2, Lcom/join/mgps/activity/SharePostsActivity$h;

    const/16 v3, 0x28

    invoke-direct {v2, p0, v3}, Lcom/join/mgps/activity/SharePostsActivity$h;-><init>(Lcom/join/mgps/activity/SharePostsActivity;I)V

    aput-object v2, v0, v1

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/activity/SharePostsActivity;->s0()V

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/SharePostsActivity;->t0()V

    return-void
.end method

.method private v0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private w0()Z
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->p0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->L0(Landroid/content/Context;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    if-nez v1, :cond_1

    .line 6
    new-instance v1, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    iget v2, p0, Lcom/join/mgps/activity/SharePostsActivity;->l:I

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setFid(I)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-static {p0}, Lcom/join/mgps/Util/j0;->o0(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setUid(I)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setToken(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    iget v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->o:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setRsid(I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setSubject(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setMessage(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setImages(Ljava/util/List;)V

    const/4 v0, 0x1

    return v0

    :cond_2
    const v0, 0x7f100299

    .line 14
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/SharePostsActivity;->showToast(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private z0(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/2addr p3, p2

    .line 4
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p4

    invoke-direct {v1, p4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 p4, 0x21

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method B0(II)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method C0(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->n:Lcom/join/mgps/dialog/w0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/w0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/w0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->n:Lcom/join/mgps/dialog/w0;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->n:Lcom/join/mgps/dialog/w0;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dialog/w0;->c(I)V

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    new-instance p1, Lcom/join/mgps/dto/ForumBean;

    invoke-direct {p1}, Lcom/join/mgps/dto/ForumBean;-><init>()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->getFid()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ForumBean;->setFid(I)V

    .line 6
    invoke-static {p0, p1}, Lcom/join/mgps/Util/j0;->r0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean;)V

    :goto_0
    return-void
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->k:Lcom/join/mgps/rpc/i;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "key_from_posts_submit_request"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "key_from_class"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/join/mgps/activity/SharePostsActivity;->D:Ljava/lang/String;

    .line 4
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->getFid()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->l:I

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    if-nez v0, :cond_1

    .line 9
    new-instance v0, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    .line 10
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/SharePostsActivity;->u0()V

    .line 11
    invoke-direct {p0}, Lcom/join/mgps/activity/SharePostsActivity;->m0()V

    return-void

    :cond_2
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->l:I

    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method back_image()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->f:Landroid/widget/TextView;

    .line 2
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 5
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/activity/SharePostsActivity;->A0()V

    return-void
.end method

.method public goMyAlbumActivity4PickPic()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/android/app/component/album/MyAlbumActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    check-cast v2, Ljava/io/Serializable;

    const-string v3, "key_selected_images"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 v1, 0x100

    .line 5
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/BaseFragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p2, 0x100

    if-ne p1, p2, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    invoke-direct {p0, p3}, Lcom/join/mgps/activity/SharePostsActivity;->q0(Landroid/content/Intent;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/SharePostsActivity;->i:Lcom/join/mgps/activity/SharePostsActivity$i;

    iget-object p2, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/SharePostsActivity$i;->d(Ljava/util/List;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/SharePostsActivity;->i:Lcom/join/mgps/activity/SharePostsActivity$i;

    invoke-virtual {p1}, Lcom/join/mgps/activity/SharePostsActivity$i;->notifyDataSetChanged()V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/SharePostsActivity;->i:Lcom/join/mgps/activity/SharePostsActivity$i;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/SharePostsActivity$i;->e(Z)V

    :cond_1
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/SharePostsActivity;->back_image()V

    return-void
.end method

.method protected onDestroy()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iput-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->p:Lcom/join/mgps/dialog/v0;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->n:Lcom/join/mgps/dialog/w0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->n:Lcom/join/mgps/dialog/w0;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/w0;->dismiss()V

    .line 6
    :cond_2
    iput-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->n:Lcom/join/mgps/dialog/w0;

    .line 7
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/SharePostsActivity;->r:Lcom/join/mgps/Util/j0$j;

    invoke-virtual {v0, v2}, Lcom/join/mgps/Util/j0;->j1(Lcom/join/mgps/Util/j0$j;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 9
    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 10
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v3

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v4, v5, v0}, Lnet/bither/util/b;->j(Landroid/content/Context;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 13
    iput-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->j:Ljava/util/List;

    .line 14
    :cond_4
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->s:Lnet/bither/util/b$e;

    invoke-virtual {v0, v1}, Lnet/bither/util/b;->z(Lnet/bither/util/b$e;)V

    .line 15
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    return-void
.end method

.method protected onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onResume()V

    .line 2
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->s:Lnet/bither/util/b$e;

    invoke-virtual {v0, v1}, Lnet/bither/util/b;->e(Lnet/bither/util/b$e;)V

    return-void
.end method

.method p0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 v0, 0x1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    const-string v3, ""

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    const-string v3, "release-->images send to server - start request.."

    .line 5
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 6
    iget-object v3, p0, Lcom/join/mgps/activity/SharePostsActivity;->k:Lcom/join/mgps/rpc/i;

    invoke-interface {v3, v1}, Lcom/join/mgps/rpc/i;->y0(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    const-string v3, "release-->images send to server - response received."

    .line 7
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "\u53d1\u5e16\u5931\u8d25"

    if-eqz v1, :cond_6

    .line 8
    :try_start_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v4

    const/16 v5, 0x2c2

    if-ne v4, v5, :cond_1

    .line 9
    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/SharePostsActivity;->showToast(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V

    .line 11
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    return-void

    .line 12
    :cond_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v4

    const/16 v5, 0x193

    if-ne v4, v5, :cond_2

    .line 13
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError_message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/SharePostsActivity;->showToast(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V

    return-void

    .line 15
    :cond_2
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v4

    const/16 v5, 0x194

    if-ne v4, v5, :cond_3

    .line 16
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError_message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/SharePostsActivity;->showToast(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V

    .line 18
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/join/mgps/Util/IntentUtil;->goVip(Landroid/content/Context;)V

    return-void

    .line 19
    :cond_3
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ForumData$ForumPostsSubmitData;

    if-eqz v2, :cond_5

    .line 20
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumData$ForumPostsSubmitData;->isResult()Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v1, "release-->images send to server - success"

    .line 21
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 22
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumData$ForumPostsSubmitData;->getReward_money()I

    move-result v1

    if-lez v1, :cond_4

    .line 23
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumData$ForumPostsSubmitData;->getReward_money()I

    move-result v1

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumData$ForumPostsSubmitData;->getReward_exp()I

    move-result v3

    invoke-virtual {p0, v1, v3}, Lcom/join/mgps/activity/SharePostsActivity;->B0(II)V

    goto :goto_0

    :cond_4
    const-string v1, "\u53d1\u5e16\u6210\u529f"

    .line 24
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/SharePostsActivity;->showToast(Ljava/lang/String;)V

    .line 25
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/activity/SharePostsActivity;->n0()V

    .line 26
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/j0;->e1(Lcom/join/mgps/dto/ForumData$ForumPostsSubmitData;)V

    goto :goto_1

    :cond_5
    const-string v2, "release-->images send to server - failed"

    .line 27
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/SharePostsActivity;->showToast(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V

    .line 30
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v1

    invoke-static {p0, v1}, Lcom/join/mgps/Util/j0;->l(Landroid/content/Context;I)I

    goto :goto_1

    .line 31
    :cond_6
    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/SharePostsActivity;->showToast(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    const-string v2, "release-->images send to server - try/catch exception"

    .line 33
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V

    .line 35
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method t0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->getHelp()I

    move-result v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->O1()J

    move-result-wide v0

    const v4, 0x7f100395

    new-array v5, v3, [Ljava/lang/Object;

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {p0, v4, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 7
    iget-object v4, p0, Lcom/join/mgps/activity/SharePostsActivity;->w:Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#f47500"

    invoke-direct {p0, v4, v2, v0, v1}, Lcom/join/mgps/activity/SharePostsActivity;->z0(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const v0, 0x7f080d93

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->t:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/join/mgps/activity/SharePostsActivity;->r0(I[Ljava/lang/String;)Landroid/widget/SimpleAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->x:Landroid/widget/SimpleAdapter;

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->v:Landroid/widget/GridView;

    invoke-virtual {v1, v0}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->v:Landroid/widget/GridView;

    new-instance v1, Lcom/join/mgps/activity/SharePostsActivity$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SharePostsActivity$g;-><init>(Lcom/join/mgps/activity/SharePostsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 11
    iput v3, p0, Lcom/join/mgps/activity/SharePostsActivity;->y:I

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->x:Landroid/widget/SimpleAdapter;

    invoke-direct {p0, v0, v3, v3}, Lcom/join/mgps/activity/SharePostsActivity;->l0(Landroid/widget/SimpleAdapter;IZ)V

    return-void

    .line 13
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method x0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const-string v0, "release-->release button pressed."

    .line 1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SharePostsActivity;->v0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "\u5e16\u5b50\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"

    .line 3
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 4
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/SharePostsActivity;->w0()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V

    .line 7
    iput v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->q:I

    .line 8
    invoke-static {}, Lnet/bither/util/b;->q()Lnet/bither/util/b;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bither/util/b;->y()V

    goto :goto_0

    .line 9
    :cond_1
    iput v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->q:I

    const-string v2, "release-->network connect failed."

    .line 10
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    const v2, 0x7f100299

    .line 11
    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/SharePostsActivity;->showToast(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 12
    iput v1, p0, Lcom/join/mgps/activity/SharePostsActivity;->q:I

    const-string v1, "release-->try/catch exception."

    .line 13
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 14
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 15
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/SharePostsActivity;->C0(I)V

    :cond_2
    :goto_0
    const-string v0, "release-->release method finished."

    .line 16
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    return-void
.end method

.method y0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->t:[Ljava/lang/String;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SharePostsActivity;->m:Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsSubmitRequestBean;->setHelp_money(I)V

    return-void
.end method
