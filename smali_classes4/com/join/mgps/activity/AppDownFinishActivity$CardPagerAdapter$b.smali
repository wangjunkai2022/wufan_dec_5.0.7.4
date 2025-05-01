.class Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter$b;
.super Ljava/lang/Object;
.source "AppDownFinishActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter;->c(Lcom/join/mgps/activity/AppDownFinishActivity$d;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter;

    iget-object p1, p1, Lcom/join/mgps/activity/AppDownFinishActivity$CardPagerAdapter;->c:Lcom/join/mgps/activity/AppDownFinishActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/AppDownFinishActivity;->finish()V

    return-void
.end method
