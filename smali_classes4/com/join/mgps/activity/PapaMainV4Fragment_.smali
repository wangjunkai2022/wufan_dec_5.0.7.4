.class public final Lcom/join/mgps/activity/PapaMainV4Fragment_;
.super Lcom/join/mgps/activity/PapaMainV4Fragment;
.source "PapaMainV4Fragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/PapaMainV4Fragment_$d;
    }
.end annotation


# instance fields
.field private final j:La4/c;

.field private k:Landroid/view/View;

.field private final l:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV4Fragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->j:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->l:Ljava/util/Map;

    return-void
.end method

.method public static d0()Lcom/join/mgps/activity/PapaMainV4Fragment_$d;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4Fragment_$d;

    invoke-direct {v0}, Lcom/join/mgps/activity/PapaMainV4Fragment_$d;-><init>()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->l:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->k:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->j:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4Fragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->k:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0635

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->k:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->k:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->k:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->b:Landroid/view/View;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->c:Landroid/widget/ViewFlipper;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->d:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->e:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->g:Landroidx/viewpager2/widget/ViewPager2;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f09132b

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->b:Landroid/view/View;

    const v0, 0x7f091563

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->c:Landroid/widget/ViewFlipper;

    const v0, 0x7f091624

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->d:Landroid/widget/TextView;

    const v0, 0x7f0915cc

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->e:Landroid/widget/TextView;

    const v0, 0x7f09135d

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    const v0, 0x7f0917c8

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment;->g:Landroidx/viewpager2/widget/ViewPager2;

    const v0, 0x7f091782

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091771

    .line 8
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09177a

    .line 9
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 10
    new-instance v2, Lcom/join/mgps/activity/PapaMainV4Fragment_$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/PapaMainV4Fragment_$a;-><init>(Lcom/join/mgps/activity/PapaMainV4Fragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 11
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4Fragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4Fragment_$b;-><init>(Lcom/join/mgps/activity/PapaMainV4Fragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 12
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4Fragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4Fragment_$c;-><init>(Lcom/join/mgps/activity/PapaMainV4Fragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4Fragment;->V()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->j:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment_;->l:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
