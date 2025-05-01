.class Lcom/join/mgps/activity/label/MainLabelActivity$g;
.super Ljava/lang/Object;
.source "MainLabelActivity.java"

# interfaces
.implements Lru/noties/scrollable/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/label/MainLabelActivity;->q0(Lcom/join/mgps/dto/MainLabelBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/label/MainLabelActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/label/MainLabelActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity$g;->a:Lcom/join/mgps/activity/label/MainLabelActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(III)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p2, p0, Lcom/join/mgps/activity/label/MainLabelActivity$g;->a:Lcom/join/mgps/activity/label/MainLabelActivity;

    add-int/lit8 p3, p3, -0xf

    if-lt p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->l0(Z)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity$g;->a:Lcom/join/mgps/activity/label/MainLabelActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-static {p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->g0(Lcom/join/mgps/activity/label/MainLabelActivity;)I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->getItem(I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/fragment/LabelFragment;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/fragment/LabelFragment;->X()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method
