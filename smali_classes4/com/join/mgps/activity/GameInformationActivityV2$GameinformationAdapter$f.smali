.class Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$f;
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
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$f;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$f;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-virtual {p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->s0()V

    return-void
.end method
