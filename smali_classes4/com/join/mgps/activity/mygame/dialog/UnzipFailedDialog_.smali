.class public final Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;
.super Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;
.source "UnzipFailedDialog_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;
    }
.end annotation


# static fields
.field public static final FROM_EXTRA:Ljava/lang/String; = "from"

.field public static final GAME_ID_EXTRA:Ljava/lang/String; = "gameId"


# instance fields
.field private final beans_:Ljava/util/Map;
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

.field private final onViewChangedNotifier_:La4/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->onViewChangedNotifier_:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->beans_:Ljava/util/Map;

    return-void
.end method

.method static synthetic access$001(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->showDomainUI(Lcom/join/mgps/dto/DomainInfoBean;)V

    return-void
.end method

.method static synthetic access$101(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->showDefaultUI()V

    return-void
.end method

.method static synthetic access$201(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->getPrivateDomain(Ljava/lang/String;I)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->prefDef_:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->gameId:Ljava/lang/String;

    :cond_0
    const-string v1, "from"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->from:I

    :cond_1
    return-void
.end method

.method public static intent(Landroid/content/Context;)Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static intent(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;
    .locals 1

    .line 2
    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$IntentBuilder_;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
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
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->beans_:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getPrivateDomain(Ljava/lang/String;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$8;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$8;-><init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->onViewChangedNotifier_:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c07c9

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f090e61

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->moreSelecter:Landroid/widget/LinearLayout;

    const v0, 0x7f090df9

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->message:Landroid/widget/TextView;

    const v0, 0x7f090664

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->gameName:Landroid/widget/TextView;

    const v0, 0x7f091319

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->startButn:Landroid/widget/TextView;

    const v0, 0x7f0906ef

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->goH5:Landroid/widget/TextView;

    const v0, 0x7f09078d

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09120b

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->sdv_image:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090cc7

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->llReUnzip:Landroid/widget/LinearLayout;

    const v0, 0x7f090dbd

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->main:Landroid/view/View;

    const v0, 0x7f091552

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091551

    .line 11
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09032d

    .line 12
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 13
    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->startButn:Landroid/widget/TextView;

    if-eqz v2, :cond_0

    .line 14
    new-instance v3, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$1;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$1;-><init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 15
    new-instance v2, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$2;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$2;-><init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v1, :cond_2

    .line 16
    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$3;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$3;-><init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->goH5:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 18
    new-instance v1, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$4;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$4;-><init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 19
    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$5;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$5;-><init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->afterviews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->beans_:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->onViewChangedNotifier_:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->onViewChangedNotifier_:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->onViewChangedNotifier_:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->injectExtras_()V

    return-void
.end method

.method showDefaultUI()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$7;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$7;-><init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showDomainUI(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$6;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$6;-><init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;Lcom/join/mgps/dto/DomainInfoBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
