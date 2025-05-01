.class public Lcom/join/mgps/activity/PAPayCenterActivity;
.super Lcom/BaseActivity;
.source "PAPayCenterActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/join/mgps/listener/b$a;


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c06d8
.end annotation


# instance fields
.field b:Lcom/join/mgps/customview/XListView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/TextView;

.field f:Lcom/facebook/drawee/view/SimpleDraweeView;

.field g:Landroid/widget/Button;

.field h:Landroid/widget/ImageView;

.field i:Landroid/widget/LinearLayout;

.field j:Lcom/join/mgps/adapter/s4;

.field k:Landroid/content/Context;

.field l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/PapayHistoryInfo;",
            ">;"
        }
    .end annotation
.end field

.field m:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/TextView;

.field p:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field q:Lcom/join/mgps/rpc/o;

.field r:I

.field private s:Z

.field private t:Lcom/wufan/user/service/protobuf/n0;

.field u:Lcom/join/mgps/dialog/d1;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->r:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->s:Z

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->x:Z

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/PAPayCenterActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->s:Z

    return p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/PAPayCenterActivity;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->t:Lcom/wufan/user/service/protobuf/n0;

    return-object p0
.end method

.method private m0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->t:Lcom/wufan/user/service/protobuf/n0;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->k:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    return-void

    .line 3
    :cond_0
    iget-boolean v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->x:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->x:Z

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->u:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Lcom/join/mgps/dialog/d1;->b()V

    .line 6
    iput v2, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->r:I

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->t:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/PAPayCenterActivity;->k0(Lcom/wufan/user/service/protobuf/n0;I)V

    goto :goto_0

    .line 8
    :cond_1
    iput v2, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->r:I

    .line 9
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/PAPayCenterActivity;->k0(Lcom/wufan/user/service/protobuf/n0;I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->n()V

    :goto_0
    return-void
.end method


# virtual methods
.method afterview()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/n;->h()Lcom/join/mgps/rpc/impl/n;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->q:Lcom/join/mgps/rpc/o;

    .line 2
    iput-object p0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->k:Landroid/content/Context;

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->k:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->u:Lcom/join/mgps/dialog/d1;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c06da

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090f8f

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->d:Landroid/widget/TextView;

    const v1, 0x7f090df9

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->e:Landroid/widget/TextView;

    const v1, 0x7f090fb4

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f090ea1

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->v:Landroid/widget/TextView;

    const v1, 0x7f090c8f

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->o:Landroid/widget/TextView;

    const v1, 0x7f090fe4

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->g:Landroid/widget/Button;

    const v1, 0x7f090e4f

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f090fe3

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->w:Landroid/widget/TextView;

    const v1, 0x7f090765

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->i:Landroid/widget/LinearLayout;

    .line 15
    iget v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->p:I

    const/16 v2, 0x8

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->c:Landroid/widget/TextView;

    const-string v3, "\u609f\u996d\u7ea2\u5305"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->g:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 18
    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->o:Landroid/widget/TextView;

    const-string v3, "\u7ea2\u5305\u4ea4\u6613\u8bb0\u5f55"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->v:Landroid/widget/TextView;

    const-string v3, "\u4f59\u989d(\u7ea2\u5305)"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 20
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->c:Landroid/widget/TextView;

    const-string v3, "\u6211\u7684\u996d\u7968"

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 22
    new-instance v1, Lcom/join/mgps/adapter/s4;

    iget-object v2, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->k:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/join/mgps/adapter/s4;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->j:Lcom/join/mgps/adapter/s4;

    .line 23
    invoke-virtual {v1}, Lcom/join/mgps/adapter/s4;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->l:Ljava/util/List;

    .line 24
    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    iget-object v1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->j:Lcom/join/mgps/adapter/s4;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->g:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView;->setPreLoadCount(I)V

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    new-instance v1, Lcom/join/mgps/activity/PAPayCenterActivity$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PAPayCenterActivity$a;-><init>(Lcom/join/mgps/activity/PAPayCenterActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V

    .line 31
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->c()V

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    new-instance v1, Lcom/join/mgps/activity/PAPayCenterActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PAPayCenterActivity$b;-><init>(Lcom/join/mgps/activity/PAPayCenterActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 33
    invoke-static {}, Lcom/join/mgps/listener/b;->b()Lcom/join/mgps/listener/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/listener/b;->a(Lcom/join/mgps/listener/b$a;)V

    .line 34
    invoke-direct {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->m0()V

    return-void
.end method

.method back_image()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method g0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x4

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    const-string v1, "http://h5.5fun.com/wf_help_pa_money.html"

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->k:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method j0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->u:Lcom/join/mgps/dialog/d1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->u:Lcom/join/mgps/dialog/d1;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method k0(Lcom/wufan/user/service/protobuf/n0;I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->s:Z

    const/4 v0, 0x0

    .line 3
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/PapayRequest;

    invoke-direct {v1}, Lcom/join/mgps/dto/PapayRequest;-><init>()V

    const/16 v2, 0xa

    .line 4
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PapayRequest;->setLimit(I)V

    .line 5
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/PapayRequest;->setToken(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/PapayRequest;->setUid(I)V

    .line 7
    invoke-virtual {v1, p2}, Lcom/join/mgps/dto/PapayRequest;->setPage(I)V

    .line 8
    iget p1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->p:I

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->q:Lcom/join/mgps/rpc/o;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapayRequest;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/join/mgps/rpc/o;->c(Ljava/util/Map;)Lcom/join/mgps/dto/PapayWalletResultMain;

    move-result-object p1

    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->q:Lcom/join/mgps/rpc/o;

    invoke-virtual {v1}, Lcom/join/mgps/dto/PapayRequest;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/join/mgps/rpc/o;->d(Ljava/util/Map;)Lcom/join/mgps/dto/PapayWalletResultMain;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/PapayWalletResultMain;->getError()I

    move-result v1

    if-nez v1, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/PapayWalletResultMain;->getData()Lcom/join/mgps/dto/PapayResultData;

    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/PAPayCenterActivity;->n0(Lcom/join/mgps/dto/PapayResultData;I)V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->o0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 15
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->o0()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    :goto_1
    iput-boolean v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->s:Z

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->j0()V

    goto :goto_3

    .line 19
    :goto_2
    iput-boolean v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->s:Z

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->j0()V

    .line 21
    throw p1

    .line 22
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->j0()V

    .line 23
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->o0()V

    :goto_3
    return-void
.end method

.method public l()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->m0()V

    return-void
.end method

.method l0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->setNoMore()V

    return-void
.end method

.method n0(Lcom/join/mgps/dto/PapayResultData;I)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_6

    const/4 v0, 0x0

    const/16 v1, 0x8

    const/4 v2, 0x1

    if-ne p2, v2, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PapayResultData;->getWallet()Lcom/join/mgps/dto/PapayInfo;

    move-result-object v3

    .line 2
    iget v4, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->p:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    .line 3
    iget-object v4, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PapayInfo;->getRed_envelope()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v4, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v4, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PapayInfo;->getMoney()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v4, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    :goto_0
    iget-object v4, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->l:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/PapayResultData;->getAd()Lcom/join/mgps/dto/PayAdinfo;

    move-result-object v4

    .line 9
    iget-object v5, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v4}, Lcom/join/mgps/dto/PayAdinfo;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v5, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/text/TextPaint;->setFlags(I)V

    .line 11
    iget-object v5, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 12
    iget-object v5, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v4}, Lcom/join/mgps/dto/PayAdinfo;->getIcon()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 13
    iget-object v5, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->e:Landroid/widget/TextView;

    new-instance v6, Lcom/join/mgps/activity/PAPayCenterActivity$c;

    invoke-direct {v6, p0, v4}, Lcom/join/mgps/activity/PAPayCenterActivity$c;-><init>(Lcom/join/mgps/activity/PAPayCenterActivity;Lcom/join/mgps/dto/PayAdinfo;)V

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v4, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->w:Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u4f59\u989d<font color = \'#fd5d58\'>"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PapayInfo;->getRed_envelope()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "</font>"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    sget-object v5, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v4, v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 15
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/PapayResultData;->getOrders()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_4

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18
    iget v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->r:I

    if-ne v0, p2, :cond_2

    add-int/2addr v0, v2

    .line 19
    iput v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->r:I

    .line 20
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->o0()V

    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 p2, 0xa

    if-ge p1, p2, :cond_3

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->l0()V

    .line 23
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    :cond_4
    if-ne p2, v2, :cond_5

    .line 24
    iget-object p1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 25
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 26
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PAPayCenterActivity;->l0()V

    .line 27
    :goto_2
    iget-object p1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->j:Lcom/join/mgps/adapter/s4;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_6
    return-void
.end method

.method o0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->q()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->b:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->r()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f090765

    if-eq p1, v0, :cond_1

    const v0, 0x7f090e4f

    if-eq p1, v0, :cond_1

    const v0, 0x7f090fe4

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/activity/PayStartActivity_;->z0(Landroid/content/Context;)Lcom/join/mgps/activity/PayStartActivity_$h;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/PAPayCenterActivity;->k:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/PAPayCenterActivity_;->u0(Landroid/content/Context;)Lcom/join/mgps/activity/PAPayCenterActivity_$h;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/PAPayCenterActivity_$h;->a(I)Lcom/join/mgps/activity/PAPayCenterActivity_$h;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    .line 2
    invoke-static {}, Lcom/join/mgps/listener/b;->b()Lcom/join/mgps/listener/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/listener/b;->d(Lcom/join/mgps/listener/b$a;)V

    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onResume()V

    return-void
.end method
