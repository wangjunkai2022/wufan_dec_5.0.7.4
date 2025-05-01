.class Lcom/join/mgps/adapter/SimulatorFastEntryViewpagerAdapter$a;
.super Landroidx/recyclerview/widget/GridLayoutManager;
.source "SimulatorFastEntryViewpagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/SimulatorFastEntryViewpagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/adapter/SimulatorFastEntryViewpagerAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/SimulatorFastEntryViewpagerAdapter;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryViewpagerAdapter$a;->a:Lcom/join/mgps/adapter/SimulatorFastEntryViewpagerAdapter;

    invoke-direct {p0, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public canScrollVertically()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
