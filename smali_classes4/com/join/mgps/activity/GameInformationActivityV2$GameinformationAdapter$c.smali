.class Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$c;
.super Ljava/lang/Object;
.source "GameInformationActivityV2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$c;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$c;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->P0(Landroid/content/Context;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$c;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;->b(Ljava/lang/String;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method
