.class public Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;
.super Lcom/BaseAppCompatActivity;
.source "HideAppCalculatorActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;,
        Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0061
.end annotation


# instance fields
.field b:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field g:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private h:Landroid/content/Context;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    const-string v0, "0"

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->m0()V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->j0()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l0()V

    return-void
.end method

.method private j0()V
    .locals 8

    const-string v0, "0"

    const-string v1, "\u8fd0\u7b97\u9519\u8bef"

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v3, "+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v6, "\\+"

    invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 3
    array-length v6, v2

    if-ne v6, v4, :cond_4

    .line 4
    aget-object v6, v2, v3

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    aget-object v2, v2, v5

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    add-float/2addr v6, v2

    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 5
    iput-boolean v5, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    goto/16 :goto_0

    .line 6
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v6, "-"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v6, "\\-"

    invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 8
    array-length v6, v2

    if-ne v6, v4, :cond_4

    .line 9
    aget-object v6, v2, v3

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    aget-object v2, v2, v5

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    sub-float/2addr v6, v2

    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 10
    iput-boolean v5, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    goto :goto_0

    .line 11
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v6, "\u00d7"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v6, "\\\u00d7"

    invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 13
    array-length v6, v2

    if-ne v6, v4, :cond_4

    .line 14
    aget-object v6, v2, v3

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    aget-object v2, v2, v5

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    mul-float v6, v6, v2

    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 15
    iput-boolean v5, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    goto :goto_0

    .line 16
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v6, "\u00f7"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 17
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v6, "\\\u00f7"

    invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 18
    array-length v6, v2

    if-ne v6, v4, :cond_4

    .line 19
    aget-object v6, v2, v5

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    const/4 v7, 0x0

    cmpl-float v6, v6, v7

    if-nez v6, :cond_3

    .line 20
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->showMessage(Ljava/lang/String;)V

    .line 21
    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 22
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 23
    :cond_3
    aget-object v6, v2, v3

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    aget-object v2, v2, v5

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    div-float/2addr v6, v2

    invoke-static {v6}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 24
    iput-boolean v5, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    .line 25
    :cond_4
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v6, "\\."

    invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 26
    array-length v6, v2

    if-ne v6, v4, :cond_5

    .line 27
    aget-object v4, v2, v5

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_5

    .line 28
    aget-object v2, v2, v3

    iput-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 29
    :cond_5
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 30
    :catch_0
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->showMessage(Ljava/lang/String;)V

    .line 31
    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 32
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method private k0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->g:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/MGMainActivity_;->A2(Landroid/content/Context;)Lcom/join/mgps/activity/MGMainActivity_$q3;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method private l0()V
    .locals 2

    const-string v0, "0"

    .line 1
    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private m0()V
    .locals 9

    const-string v0, "\u00f7"

    const-string v1, "\u00d7"

    const-string v2, "-"

    const-string v3, "+"

    .line 1
    :try_start_0
    iget-object v4, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 2
    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    const/high16 v5, 0x42c80000    # 100.0f

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x2

    if-eqz v4, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v1, "\\+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 4
    array-length v1, v0

    if-ne v1, v8, :cond_4

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v2, v0, v7

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v6

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    div-float/2addr v0, v5

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    goto/16 :goto_0

    .line 6
    :cond_0
    iget-object v3, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v1, "\\-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 8
    array-length v1, v0

    if-ne v1, v8, :cond_4

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v3, v0, v7

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v6

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    div-float/2addr v0, v5

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    goto :goto_0

    .line 10
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v2, "\\\u00d7"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 12
    array-length v2, v0

    if-ne v2, v8, :cond_4

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v3, v0, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v6

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    div-float/2addr v0, v5

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    goto :goto_0

    .line 14
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v2, "\\\u00f7"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 16
    array-length v2, v1

    if-ne v2, v8, :cond_4

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v3, v1, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v1, v6

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    div-float/2addr v0, v5

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    goto :goto_0

    .line 18
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    div-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 19
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 20
    array-length v1, v0

    if-ne v1, v8, :cond_5

    .line 21
    aget-object v1, v0, v6

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_5

    .line 22
    aget-object v0, v0, v7

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 23
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const-string v0, "\u8fd0\u7b97\u9519\u8bef"

    .line 25
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->showMessage(Ljava/lang/String;)V

    const-string v0, "0"

    .line 26
    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 27
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method private o0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "AC"

    const-string v3, "#A5A5A5"

    const-string v4, "#000000"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "DEL"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "%"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "\u00f7"

    const-string v3, "#FEA00A"

    const-string v4, "#FFFFFF"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "7"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "8"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "9"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "\u00d7"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "4"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "5"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "6"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "+"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "1"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "2"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "3"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "-"

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "0"

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "."

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    const-string v2, "="

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->h:Landroid/content/Context;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 22
    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$a;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 23
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 24
    new-instance v0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->j:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;

    .line 25
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->j:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$c;

    new-instance v1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$b;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 29
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "default.alias"

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 30
    new-instance v1, Landroid/content/ComponentName;

    const-string v3, "com.join.mgps.activity.hideapp.HideAppNotebookActivity_"

    invoke-direct {v1, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 31
    new-instance v1, Landroid/content/ComponentName;

    const-string v4, "com.join.mgps.activity.hideapp.HideAppCalculatorActivity_"

    invoke-direct {v1, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 32
    invoke-static {p0}, Lcom/join/mgps/Util/w1;->a(Landroid/content/Context;)V

    .line 33
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/MGMainActivity_;->A2(Landroid/content/Context;)Lcom/join/mgps/activity/MGMainActivity_$q3;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method


# virtual methods
.method afterviews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->h:Landroid/content/Context;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->e:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v2, 0x4000000

    const/16 v3, 0x15

    if-lt v0, v3, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x500

    invoke-virtual {v2, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v2, -0x80000000

    .line 8
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 11
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v0

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->b:Landroid/view/View;

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 14
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->f:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->hide_app_pwd()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->m:Ljava/lang/String;

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->o0()V

    return-void
.end method

.method back_image()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    return-void
.end method

.method n0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    const-string v0, "0"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    return-void
.end method

.method p0(Ljava/lang/String;Z)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    const-string v1, ".*[\\+\\-\\\u00d7\\\u00f7]$"

    const-string v2, "."

    const/4 v3, 0x0

    if-nez p2, :cond_4

    .line 2
    iget-boolean p2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    if-eqz p2, :cond_1

    .line 3
    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 5
    iput-boolean v3, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    goto :goto_0

    :cond_1
    const-string p2, "0"

    .line 6
    invoke-static {v0, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 7
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 8
    iput-boolean v3, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    goto :goto_0

    .line 9
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 11
    iput-boolean v3, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    goto :goto_0

    .line 12
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_0

    .line 13
    :cond_5
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->j0()V

    .line 14
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    .line 15
    iput-boolean v3, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->l:Z

    .line 16
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->k0()V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
