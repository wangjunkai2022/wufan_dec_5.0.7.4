.class public Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;
.super Lcom/BaseAppCompatActivity;
.source "HideAppSetPwdActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0064
.end annotation


# instance fields
.field b:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field g:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field private h:Landroid/content/Context;

.field i:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->o0()V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->j0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->n0()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->l0(Ljava/lang/String;)V

    return-void
.end method

.method private initView()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f:I

    const/16 v1, 0x64

    const/16 v2, 0x63

    const/4 v3, 0x1

    if-eq v0, v3, :cond_0

    const/4 v4, 0x2

    if-eq v0, v4, :cond_0

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iput-boolean v3, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i:Z

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->c:Landroid/widget/TextView;

    const-string v1, "\u8f93\u5165\u4f2a\u88c5\u5bc6\u7801"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    if-ne v0, v2, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->c:Landroid/widget/TextView;

    const-string v1, "\u8f93\u5165\u65e7\u5bc6\u7801"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    if-ne v0, v1, :cond_3

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->c:Landroid/widget/TextView;

    const-string v1, "\u8f93\u5165\u65b0\u5bc6\u7801"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->q0()V

    return-void
.end method

.method private j0(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_6

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_5

    const v3, 0x7f09153b

    .line 4
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 5
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 6
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f090867

    .line 7
    invoke-virtual {v2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v2, "#FFFFFF"

    .line 8
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    const/4 p1, 0x1

    sub-int/2addr v0, p1

    if-ne v1, v0, :cond_6

    .line 9
    iget v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f:I

    if-nez v0, :cond_1

    .line 10
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->k0()V

    goto :goto_1

    :cond_1
    const/16 v1, 0x63

    if-ne v0, v1, :cond_2

    .line 11
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->m0()V

    goto :goto_1

    :cond_2
    const/16 v1, 0x64

    if-ne v0, v1, :cond_3

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->r0()V

    goto :goto_1

    :cond_3
    if-eq v0, p1, :cond_4

    const/4 p1, 0x2

    if-ne v0, p1, :cond_6

    .line 13
    :cond_4
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->r0()V

    goto :goto_1

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return-void
.end method

.method private k0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->p0()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->hide_app_pwd()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->r0()V

    goto :goto_0

    :cond_0
    const-string v0, "\u5bc6\u7801\u6821\u9a8c\u672a\u901a\u8fc7"

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->showMessage(Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->n0()V

    :goto_0
    return-void
.end method

.method private l0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->hide_app_pwd()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    iget-boolean v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i:Z

    if-eqz v1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-virtual {v0, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->hide_app_switch()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p1

    iget-boolean v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f:I

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    .line 4
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "default.alias"

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    iget-boolean v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i:Z

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-nez v1, :cond_2

    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    .line 6
    :goto_1
    invoke-virtual {p1, v0, v1, v3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 7
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.join.mgps.activity.hideapp.HideAppNotebookActivity_"

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    iget-boolean v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i:Z

    if-nez v1, :cond_3

    iget v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f:I

    if-ne v1, v3, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x2

    .line 9
    :goto_2
    invoke-virtual {p1, v0, v1, v3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 10
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.join.mgps.activity.hideapp.HideAppCalculatorActivity_"

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 11
    iget-boolean v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i:Z

    if-nez v1, :cond_4

    iget v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f:I

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x2

    .line 12
    :goto_3
    invoke-virtual {p1, v0, v1, v3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 13
    iget-boolean p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i:Z

    if-nez p1, :cond_7

    .line 14
    iget p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f:I

    if-ne p1, v3, :cond_5

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->h:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity_;->h0(Landroid/content/Context;)Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity_$b;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity_$b;->a(Z)Lcom/join/mgps/activity/hideapp/HideAppNotebookActivity_$b;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_4

    :cond_5
    if-ne p1, v2, :cond_6

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->h:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->t0(Landroid/content/Context;)Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;->a(Z)Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 17
    :cond_6
    :goto_4
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->h:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->usefakeAPP:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 18
    invoke-static {p0}, Lcom/join/mgps/Util/w1;->f(Landroid/content/Context;)V

    goto :goto_5

    .line 19
    :cond_7
    invoke-static {p0}, Lcom/join/mgps/Util/w1;->a(Landroid/content/Context;)V

    .line 20
    :goto_5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private m0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->p0()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->hide_app_pwd()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    .line 4
    iput v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->f:I

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->n0()V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->initView()V

    goto :goto_0

    :cond_0
    const-string v0, "\u5bc6\u7801\u6821\u9a8c\u672a\u901a\u8fc7"

    .line 7
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->showMessage(Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->n0()V

    :goto_0
    return-void
.end method

.method private n0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    const v3, 0x7f09153b

    .line 3
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const-string v4, ""

    .line 4
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v3, 0x7f090867

    .line 5
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "#FF656565"

    .line 6
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private o0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    add-int/lit8 v3, v0, -0x1

    sub-int/2addr v3, v1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    const v3, 0x7f09153b

    .line 4
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 5
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v0, ""

    .line 6
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f090867

    .line 7
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "#FF656565"

    .line 8
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private p0()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    iget-object v3, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    const v4, 0x7f09153b

    .line 3
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 4
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private q0()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "7"

    .line 2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "8"

    .line 3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "9"

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "4"

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "5"

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "6"

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "1"

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "2"

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "3"

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "0"

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "."

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "\u00d7"

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v3, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->h:Landroid/content/Context;

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 15
    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$c;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$c;-><init>(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;Ljava/util/List;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 17
    new-instance v2, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$a;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$a;-><init>(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    return-void
.end method

.method private r0()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->p0()Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/join/mgps/dialog/a1;

    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->h:Landroid/content/Context;

    iget-boolean v3, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->i:Z

    invoke-direct {v1, v2, v0, v3}, Lcom/join/mgps/dialog/a1;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 3
    new-instance v0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity$b;-><init>(Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;)V

    invoke-virtual {v1, v0}, Lcom/join/mgps/dialog/a1;->a(Lcom/join/mgps/dialog/a1$a;)V

    .line 4
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    return-void
.end method


# virtual methods
.method afterviews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->h:Landroid/content/Context;

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0x4000000

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x500

    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x13

    if-lt v0, v2, :cond_1

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 9
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v0

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->d:Landroid/view/View;

    if-eqz v1, :cond_2

    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 12
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->initView()V

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

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
